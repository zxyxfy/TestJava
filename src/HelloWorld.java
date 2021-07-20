import java.util.ArrayList;
import java.util.OptionalInt;

public class HelloWorld implements IHelloWorld {

    //不含税承担金额=协议总价不含税价*（退款金额/支付金额）
    private Long getAmountExcludingTax(Long protocolPrice, Long refundAmount, Long paymentAmount, Long rate) {
        System.out.println(protocolPrice.doubleValue() * refundAmount.doubleValue() * 100.0);
        System.out.println(protocolPrice.doubleValue() * refundAmount.doubleValue() * 100.0 / paymentAmount.doubleValue());
        System.out.println(protocolPrice.doubleValue() * refundAmount.doubleValue() * 100.00 / paymentAmount.doubleValue() / (100.00 + rate.doubleValue()));
        return Math.round(protocolPrice.doubleValue() * refundAmount.doubleValue() * 100.00 / paymentAmount.doubleValue() / (100.00 + rate.doubleValue()));
    }

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(Long.parseLong("1547")/100.00);
        System.out.println("push commit");
    }


    @Override

    public void test() {
        boolean isNull = true;
        if (!isNull) {

        }
        int i = 0;
        OptionalInt.of(i);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

import java.math.BigDecimal;

public class Main {
    public static void main(String... args) {
        long A = Long.parseLong(args[0]);
        float B = Float.parseFloat(args[1]);
        BigDecimal a = BigDecimal.valueOf(198);
        BigDecimal b = BigDecimal.valueOf(1.10);
        System.out.println(a.multiply(b).longValue());
    }
}

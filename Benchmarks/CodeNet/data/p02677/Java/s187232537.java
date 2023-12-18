import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        BigDecimal h = new BigDecimal(sc.next());
        BigDecimal m = new BigDecimal(sc.next());

        BigDecimal circle = new BigDecimal("360");

        BigDecimal aTheta = circle.multiply(h.divide(new BigDecimal("12"), 10, BigDecimal.ROUND_HALF_EVEN)).add(new BigDecimal("30").multiply(m.divide(new BigDecimal("60"), 10, BigDecimal.ROUND_HALF_EVEN)));
        BigDecimal bTheta = circle.multiply(m.divide(new BigDecimal("60"), 10, BigDecimal.ROUND_HALF_EVEN));
        BigDecimal subAB = aTheta.subtract(bTheta).abs();
        BigDecimal theta = subAB.min(circle.subtract(subAB));
        BigDecimal cos = new BigDecimal(Math.cos(Math.toRadians(theta.doubleValue())));
        BigDecimal ansSq = a.pow(2).add(b.pow(2)).subtract(new BigDecimal("2").multiply(a).multiply(b).multiply(cos));
        double ans = Math.sqrt(ansSq.doubleValue());

        System.out.println(ans);    
    }
}

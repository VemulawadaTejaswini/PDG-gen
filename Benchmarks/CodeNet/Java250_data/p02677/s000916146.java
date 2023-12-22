import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal h = sc.nextBigDecimal();
        BigDecimal m = sc.nextBigDecimal();

        // 角度を求める
        BigDecimal hangle = new BigDecimal(360).divide(new BigDecimal(12)).multiply(h).add(m.multiply(new BigDecimal(0.5)));
        BigDecimal mangle = new BigDecimal(360).divide(new BigDecimal(60)).multiply(m);
        BigDecimal diffangle = hangle.subtract(mangle).abs();
        if(diffangle.compareTo(new BigDecimal(180)) > 0){
            diffangle = new BigDecimal(360).subtract(diffangle);
        }

        BigDecimal cpow;
        if(diffangle.compareTo(new BigDecimal(90)) == 0) {
            BigDecimal apow = a.pow(2);
            BigDecimal bpow = b.pow(2);
            cpow = apow.add(bpow);
        } else {
            BigDecimal cos = new BigDecimal(Math.cos(Math.toRadians(diffangle.doubleValue())));
            BigDecimal apow = a.pow(2);
            BigDecimal bpow = b.pow(2);
            cpow = apow.add(bpow).subtract(new BigDecimal(2).multiply(a).multiply(b).multiply(cos));
        }
        System.out.println(Math.sqrt(cpow.doubleValue()));
    }
}

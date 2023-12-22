import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            double resultX = (c * e - b * f) / (a * e - b * d);
            double resultY =  (c - a * resultX) / b;
            BigDecimal x = new BigDecimal(resultX).setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal y = new BigDecimal(resultY).setScale(3, BigDecimal.ROUND_HALF_UP);
            System.out.println(x + " " + y);
        }
    }
}


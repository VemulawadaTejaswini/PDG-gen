import java.util.Scanner;
import java.math.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        BigDecimal shortNeedle = BigDecimal.valueOf(a);
        BigDecimal longNeedle = BigDecimal.valueOf(b);

        //短針と長針のなす角（度数）
        BigDecimal cos = BigDecimal.valueOf(Math.cos(Math.toRadians((30*h + 0.25*m) - 6*m)));

        BigDecimal distance = shortNeedle.pow(2).add(longNeedle.pow(2)).subtract(BigDecimal.valueOf(2).multiply(shortNeedle).multiply(longNeedle).multiply(cos)).sqrt(new MathContext(50));

        System.out.println(distance.toString());
    }    
}
import java.util.Scanner;
import java.math.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int b = 4;
        int h = 9;
        int m = 0;
        sc.close();

        BigDecimal shortNeedle = BigDecimal.valueOf(a);
        BigDecimal longNeedle = BigDecimal.valueOf(b);

        //短針と長針のなす角（度数）
        BigDecimal cos = BigDecimal.valueOf(Math.cos(Math.toRadians(BigDecimal.valueOf(30*h).add(BigDecimal.valueOf(0.25).multiply(BigDecimal.valueOf(m))).subtract(BigDecimal.valueOf(6*m)).doubleValue())));

        String cosstr = cos.toString();
        BigDecimal distance = shortNeedle.pow(2).add(longNeedle.pow(2)).subtract(BigDecimal.valueOf(2).multiply(shortNeedle).multiply(longNeedle).multiply(cos)).sqrt(new MathContext(10));

        System.out.println(distance.toString());
    }    
}
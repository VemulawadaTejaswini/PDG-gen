import java.math.BigDecimal;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal cc = aa.multiply(bb);
        BigDecimal sum = cc.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println(sum);
    }
}
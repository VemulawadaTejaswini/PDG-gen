import java.math.BigDecimal;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int d = a / b;
        int r = a % b;
        double f = 1.0 * a / b;
        BigDecimal g = new BigDecimal(f);
        g = g.setScale(5,BigDecimal.ROUND_HALF_UP);
        System.out.printf("%d" + " " + "%d" + " " + "%.5f",d, r, g);
    }
}
import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        double v = (d/3)*(d/3)*(d/3);
        System.out.println(v);
    }
}
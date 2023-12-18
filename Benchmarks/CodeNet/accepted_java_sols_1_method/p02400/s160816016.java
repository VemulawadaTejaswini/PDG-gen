import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double a, b;
        a = 3.141592653589 * r * r;
        b = 3.141592653589 * 2 * r;
        DecimalFormat df = new DecimalFormat("0.000000000");

        System.out.println(df.format(a) + " " + df.format(b));
    }
}
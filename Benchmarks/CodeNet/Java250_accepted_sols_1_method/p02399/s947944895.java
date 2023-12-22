import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d;
        int r;
        double f;

        d = a / b;
        r = a % b;
        f = ((double) a) / b;
       
        DecimalFormat df = new DecimalFormat("0.000000000");
        //  DecimalFormat df = new DecimalFormat("###.000");
        String n = df.format(f);
        System.out.println(d + " " + r + " " + n);
    }
}

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        double a,b;
        a=3.141592653589*r*r;
        b=3.141592653589*2*r;

        System.out.println(a+ " " + b);
    }
}
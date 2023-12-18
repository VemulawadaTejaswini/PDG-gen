import java.util.Scanner;

/**
 * Digit Number
 * @author yoshimura
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Integer sum =  a + b;
            System.out.println(sum.toString().length());
        }
    }
}
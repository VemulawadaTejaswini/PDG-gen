import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for (int x = a; x <= b; x++) {

            if (c % x == 0) {
                num++;
         
            }
        }

        System.out.println(num);
    }

}
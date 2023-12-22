
import java.util.Scanner;

/**
 * Created by oka on 2018/06/05.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x == 1) {
            System.out.println(1);
            return;
        }

        int b = 2;
        int pow = b;
        int counter = 1;
        int max = 1;
        while (true) {
            pow *= b;
            counter++;
            if (pow > x) {
                if (counter == 2) {
                    break;
                } else {
                    b++;
                    pow = b;
                    counter = 1;
                }
            } else {
                if (max < pow) {
                    max = pow;
                }
            }
        }
        System.out.println(max);
    }
}


import java.util.Scanner;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;
        while (!(i == (num + 1))) {
            int x = i;
            if (x % 3 == 0) {
                System.out.print(" " + i);
            } else if (x % 10 == 3) {
                System.out.print(" " + i);
            } else if (x / 10 != 0) {
                while (x / 10 != 0) {
                    x /= 10;
                    if (x % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                }
            }

            i++;
        }
        System.out.println();
    }

}


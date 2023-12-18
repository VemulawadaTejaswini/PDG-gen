import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] s = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double m = sum / (double) n;
            double a = 0.0;
            for (int i = 0; i < n; i++) {
                a += (s[i] - m) * (s[i] - m);
            }
            a = a / (double) n;

            System.out.println(Math.sqrt(a));

        }
    }

}


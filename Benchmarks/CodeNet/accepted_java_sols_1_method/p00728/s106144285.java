import java.util.Scanner;

/**
 * Score
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int min = 2000, max = -1, sum = 0;
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                sum += s;
                if (s >= max) {
                    max = s;
                }
                if (s <= min) {
                    min = s;
                }
            }
            System.out.println((sum - max - min) / (n - 2));
        }
        sc.close();
    }
}

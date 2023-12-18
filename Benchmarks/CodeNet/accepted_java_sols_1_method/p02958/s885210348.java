
import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] num = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            num[i] = scanner.nextInt();
        }

        int swap = 0;
        for (int i = 1; i <= n; ++i) {
            if (num[i] != i) {
                if (num[num[i]] != i) {
                    System.out.println("NO");
                    return;
                }
                int pos = num[i];
                num[i] = i;
                num[pos] = pos;
                ++swap;

                if (swap >= 2) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}

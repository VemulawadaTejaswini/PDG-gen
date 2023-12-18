
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int isA[] = new int[n + 1];
        int isB[] = new int[n + 1];
        int isC[] = new int[n + 1];

        {
            int m = scanner.nextInt();
            for (int i = 0; i < m; ++i) {
                int user = scanner.nextInt();
                isA[user] = 1;
            }
        }

        {
            int m = scanner.nextInt();
            for (int i = 0; i < m; ++i) {
                int user = scanner.nextInt();
                isB[user] = 1;
            }
        }

        {
            int m = scanner.nextInt();
            for (int i = 0; i < m; ++i) {
                int user = scanner.nextInt();
                isC[user] = 1;
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (isA[i] == 0 && isC[i] == 1 || isB[i] == 1 && isC[i] == 1) {
                ans++;
            }
        }
        
        System.out.println(ans);

    }
}


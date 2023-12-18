import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        int[] p = new int[d];
        int[] c = new int[d];
        int cnt = 0;
        for (int i = 0; i < d; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt();
            cnt += p[i];
        }
        int point = 0;
        int dp[] = new int[cnt + 1];
        for (int i = 0; i < d; i++) {
            for (int j = point; j >= 0; j--) {
                for (int k = 0; k < p[i]; k++) {
                    int tmp = dp[j] + (i + 1) * 100 * (k + 1);
                    if (k + 1 == p[i]) {
                        tmp += c[i];
                    }
                    if (tmp > dp[j + k + 1]) {
                        dp[j + k + 1] = tmp;
                    }
                }
            }
            point += p[i];
        }
        for (int i = 0; i < cnt + 1; i++) {
            if (g <= dp[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
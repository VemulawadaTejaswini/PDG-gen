import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextInt();
        }
        int[] t = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < m; i++) {
            for (int j = c[i]; j <= n; j++) {
                t[j] = Math.min(t[j], t[j - c[i]] + 1);
            }
        }
        System.out.println(t[n]);
    }
}

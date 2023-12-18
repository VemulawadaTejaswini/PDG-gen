import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int cnt = 1;
                boolean[] visited = new boolean[n];
                long p = x[i] - x[j];
                long q = y[i] - y[j];
                visited[i] = true;
                visited[j] = true;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (visited[l]) {
                            continue;
                        }
                        if (x[k] - p == x[l] && y[k] - q == y[l]) {
                            visited[l] = true;
                        }
                    }
                }
                for (int k = 0; k < n; k++) {
                    if (!visited[k]) {
                        cnt++;
                    }
                }
                ans = Math.min(ans, cnt);
            }
        }
        System.out.println(ans);
    }

}

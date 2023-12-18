import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    int ans;
    int m;
    List<Integer> f;
    int as[];

    void run() {
        int n = sc.nextInt();
        char[] id = new StringBuilder(sc.next()).reverse().toString()
                .toCharArray();
        m = sc.nextInt();
        as = new int[m];
        for (int i = 0; i < m; i++) {
            as[i] = sc.nextInt();
        }
        f = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (id[i] == '*') {
                f.add(i);
                continue;
            }
            int num = id[i] - '0';
            if (i % 2 == 1)
                num *= 2;
            sum += num / 10 + num % 10;

        }
        ans = 0;
        solve(0, sum);
        System.out.println(ans);
    }

    void solve(int k, int sum) {
        if (k == f.size()) {
            if (sum % 10 == 0) {
                ans++;
            }
            return;
        }
        for (int i = 0; i < m; i++) {
            int num = as[i];
            if (f.get(k) % 2 == 1) {
                num *= 2;
            }
            solve(k + 1, sum + num / 10 + num % 10);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
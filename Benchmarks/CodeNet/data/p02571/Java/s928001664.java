import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String T = scan.next();
        char[] d_s = S.toCharArray();
        char[] d_t = T.toCharArray();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= d_s.length - d_t.length; i++) {
            int temp = 0;
            for (int j = 0; j < d_t.length; j++) {
                if (d_s[i+j] != d_t[j]) {
                    temp += 1;
                }
            }
            ans = Math.min(ans, temp);
        }
        System.out.println(ans);
    }
}

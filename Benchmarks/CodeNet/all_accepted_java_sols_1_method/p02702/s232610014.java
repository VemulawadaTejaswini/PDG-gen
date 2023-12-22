import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int maxN = (int) 2e5 + 5;
    public static int mod = 2019;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length(), x = 0, y = 1;
        int[] cnt = new int[mod];
        for (int i = n - 1; i >= 0; i--) {
            x = (x + (s.charAt(i) - '0') * y) % mod;
            y = y * 10 % mod;
            cnt[x]++;
        }
        long ans = 0;

        for (int i = 1; i < 2019; i++) {
            if (cnt[i] > 1) {
                ans += (long) (cnt[i] - 1 + 1) * (cnt[i] - 1) / 2;
            }
        }
        ans += (long) cnt[0] * (cnt[0] + 1) / 2;

        System.out.println(ans);

    }
}

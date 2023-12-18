import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        int res = 0;
        int left = 0;
        int right = 0;
        int mod = 1000000007;
        for (int i = 0; i < N + 1; i++) {
            left += i;
            left %= mod;
            right += N - i;
            right %= mod;
            if (i + 1 >= K) {
                res += (right - left + 1 + mod) % mod;
                res %= mod;
            }
        }
        System.out.println(res);
    }
}
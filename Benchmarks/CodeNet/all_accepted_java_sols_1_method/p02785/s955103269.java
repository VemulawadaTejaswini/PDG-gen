import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        long k = Long.parseLong(stdIn.next());
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = Long.parseLong(stdIn.next());
        }

        Arrays.sort(h);

        long ans = 0;
        for (int i = 0; i <= n - k - 1; i++) {
            ans += h[i];
        }
        System.out.println(ans);
    }
}
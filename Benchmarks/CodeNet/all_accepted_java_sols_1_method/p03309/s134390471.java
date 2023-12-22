import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] diff = new long[n];

        for (int i = 0; i < n; i++) {
            diff[i] = sc.nextLong() - i - 1;
        }

        Arrays.sort(diff);
        long median = diff[n/2];

        long ans = 0;
        for (long i : diff) {
            ans += Math.abs(i - median);
        }

        System.out.println(ans);
    }
}

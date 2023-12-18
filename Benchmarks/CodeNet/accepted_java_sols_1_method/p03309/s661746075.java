import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long[] sub = new long[n];
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            sub[i] = temp - (i + 1);
        }
        Arrays.sort(sub);
        long center = 0;
        if (n % 2 != 0) {
            center = sub[n / 2];
        } else {
            center = (sub[n / 2] + sub[n / 2 - 1]) / 2;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - (center + i + 1));
        }
        System.out.println(ans);
    }
}
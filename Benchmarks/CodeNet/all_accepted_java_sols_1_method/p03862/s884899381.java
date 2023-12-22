import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Long.parseLong(sc.next());
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ary[i] + ary[i + 1] > x) {
                long temp = ary[i] + ary[i + 1] - x;
                ans += temp;
                if (ary[i + 1] < temp) {
                    ary[i + 1] = 0;
                } else {
                    ary[i + 1] -= temp;
                }
            }
        }
        System.out.println(ans);
    }
}
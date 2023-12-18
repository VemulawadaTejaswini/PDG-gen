import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            ary[i] = a;
        }
        long ans = 0;
        long cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ary[i] >= ary[i + 1]) {
                cnt++;
            } else {
                if (ans < cnt) {
                    ans = cnt;
                }
                cnt = 0;
            }
        }
        if (ans < cnt) {
            ans = cnt;
        }
        System.out.println(ans);
    }
}
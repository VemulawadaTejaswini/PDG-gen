import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long t = Long.parseLong(sc.next());
        long ans = 0;
        long temp = 0;
        for (int i = 0; i < n; i++) {
            long tt = Long.parseLong(sc.next());
            ans += Math.min(tt - temp, t);
            temp = tt;
            if (i == n - 1) {
                ans += t;
            }
        }
        System.out.println(ans);
    }
}
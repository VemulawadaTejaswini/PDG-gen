import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long d = Long.parseLong(sc.next());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(sc.next());
            long y = Long.parseLong(sc.next());
            if (x * x + y * y <= d * d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
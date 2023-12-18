import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans += ((n + i - 1) / i) - 1;
        }
        System.out.println(ans);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();
            if (T >= t) {
                if (ans > c) {
                    ans = c;
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(ans);
        }
    }
}
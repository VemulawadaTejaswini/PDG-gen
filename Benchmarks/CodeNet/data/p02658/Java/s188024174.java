import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        final long x = (long) Math.pow(10, 18);

        for (int i = 0; i < n; i++) {
            ans *= sc.nextLong();
        }
        if (ans > x || ans < 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
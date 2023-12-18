import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long d = in.nextInt();
        long ans = 0;
        for (long i = 0; i < n; i++) {
            long x = in.nextInt();
            long y = in.nextInt();

            if (d * d >= x * x + y * y) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
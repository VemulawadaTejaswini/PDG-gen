import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextLong();
        long R = scan.nextLong();
        int ans = Integer.MAX_VALUE;
        long x = 0;
        if (R - L >= 2019) {
            System.out.println(0);
            System.exit(0);
        }
        for (long i = L; i < R; i++) {
            for (long j = L + 1; j <= R; j++) {
                int m = (int) ((i * j) % 2019);
                ans = Math.min(ans, m);
            }
        }
        System.out.println(ans);
    }
}
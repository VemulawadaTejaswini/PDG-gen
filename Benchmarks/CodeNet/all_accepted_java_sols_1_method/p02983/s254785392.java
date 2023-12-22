import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int ans = Integer.MAX_VALUE;
        long x = 0;
        if (R - L >= 2019) {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = L; i < R; i++) {
            for (int j = L + 1; j <= R; j++) {
                int m = (int)(((long)i * j) % 2019);
                ans = Math.min(ans, m);
            }
        }
        System.out.println(ans);
    }
}
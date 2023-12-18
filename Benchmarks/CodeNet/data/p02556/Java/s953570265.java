import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long xminx = sc.nextLong();
        long xminy = sc.nextLong();
        long yminx = xminx;
        long yminy = xminy;
        long xmaxx = xminx;
        long xmaxy = xminy;
        long ymaxx = xminx;
        long ymaxy = xminy;

        for (int i=1;i<n;i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (xminx > x) {
                xminx = x;
                xminy = y;
            }
            if (yminy > y) {
                yminx = x;
                yminy = y;
            }
            if (xmaxx < x) {
                xmaxx = x;
                xmaxy = y;
            }
            if (ymaxy < y) {
                ymaxx = x;
                ymaxy = y;
            }
        }
        long ans = Math.abs(xminx - yminx) + Math.abs(xminy - yminy);
        long ans2 = Math.abs(xminx - xmaxx) + Math.abs(xminy - xmaxy);
        long ans3 = Math.abs(xminx - ymaxx) + Math.abs(xminy - ymaxy);
        long ans4 = Math.abs(yminx - xmaxx) + Math.abs(yminy - xmaxy);
        long ans5 = Math.abs(yminx - ymaxx) + Math.abs(yminy - ymaxy);
        long ans6 = Math.abs(xmaxx - ymaxx) + Math.abs(xmaxy - ymaxy);

        if (ans < ans2) {
            ans = ans2;
        }
        if (ans < ans3) {
            ans = ans3;
        }
        if (ans < ans4) {
            ans = ans4;
        }
        if (ans < ans5) {
            ans = ans5;
        }
        if (ans < ans6) {
            ans = ans6;
        }

        System.out.println(ans);
    }
}

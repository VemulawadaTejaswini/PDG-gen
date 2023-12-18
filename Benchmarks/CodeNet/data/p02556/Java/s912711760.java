import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long xplusyx = sc.nextLong();
        long xplusyy = sc.nextLong();
        long xplusy = xplusyx + xplusyy;
        long xminusyx = xplusyx;
        long xminusyy = xplusyy;
        long xminusy = xplusyx - xplusyy;
        long yminusxx = xplusyx;
        long yminusxy = xplusyy;
        long yminusx = xplusyy - xplusyx;
        long xyminusx = xplusyx;
        long xyminusy = xplusyy;
        long xyminus = xplusyx + xplusyy;

        for (int i=1;i<n;i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (xplusy < (x+y)) {
                xplusy = x+y;
                xplusyx = x;
                xplusyy = y;
            }
            if (xyminus > (x+y)) {
                xyminus = x+y;
                xyminusx = x;
                xyminusy = y;
            }
        }
        long ans = Math.abs(xplusyx - xyminusx) + Math.abs(xplusyy - xyminusy);

        System.out.println(ans);
    }
}

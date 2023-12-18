import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();
        var m = scaner.nextInt();
        var k = scaner.nextInt();

        var a = new int[n];
        var asum = 0;
        for (int i = 0; i < n; i++) {
            var book = scaner.nextInt();
            a[i] = book;
            asum += book;
        }

        var b = new int[m];
        var bsum = 0;
        for (int i = 0; i < m; i++) {
            var book = scaner.nextInt();
            b[i] = book;
            bsum += book;
        }

        if (asum + bsum <= k) {
            System.out.println(n+m);
        } else {
            var ans = 0;
            var ap = 0;
            var bp= 0;
            while(0 < k) {
                int time;
                var aavg = asum / n-ap;
                var bavg = bsum / m-bp;
                if (ap < n && bp < m) {
                    if (aavg < bavg) {
                        time = a[ap];
                        asum -= a[ap];
                        ap++;
                    } else {
                        time = b[bp];
                        bsum -= b[bp];
                        bp++;
                    }
                } else if (ap < n) {
                    time = a[ap];
                    asum -= a[ap];
                    ap++;
                } else if (bp < m) {
                    time = b[bp];
                    bsum -= b[bp];
                    bp++;
                } else {
                    break;
                }

                if (time <= k) {
                    k -= time;
                    ans++;
                }
            }
            System.out.println(ans);
        }

        scaner.close();
    }

}

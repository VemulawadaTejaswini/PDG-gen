import java.util.Scanner;

class Main {

    static int[] a;
    static int asum;

    static int[] b;
    static int bsum;

    static int ans = 0;
    static int ap = 0;
    static int bp= 0;

    static int time;

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();
        var m = scaner.nextInt();
        var k = scaner.nextInt();

        a = new int[n];
        asum = 0;
        for (int i = 0; i < n; i++) {
            var book = scaner.nextInt();
            a[i] = book;
            asum += book;
        }

        b = new int[m];
        bsum = 0;
        for (int i = 0; i < m; i++) {
            var book = scaner.nextInt();
            b[i] = book;
            bsum += book;
        }

        if (asum + bsum <= k) {
            System.out.println(n+m);
        } else {

            while(0 < k) {
                time = 0;
                var aavg = asum / n-ap;
                var bavg = bsum / m-bp;
                if (ap < n && bp < m) {
                    if (a[ap] == b[bp]) {
                        if (aavg < bavg) {
                            readA();
                        } else {
                            readB();
                        }
                    } else {
                        if (a[ap] < b[bp]) {
                            readA();
                        } else {
                            readB();
                        }
                    }

                } else if (ap < n) {
                    readA();
                } else if (bp < m) {
                    readB();
                } else {
                    break;
                }

                if (time <= k) {
                    k -= time;
                    ans++;
                } else {
                    break;
                }
            }
            System.out.println(ans);
        }

        scaner.close();
    }

    static void readA() {
        time = a[ap];
        asum -= a[ap];
        ap++;
    }

    static void readB() {
        time = b[bp];
        bsum -= b[bp];
        bp++;
    }

}

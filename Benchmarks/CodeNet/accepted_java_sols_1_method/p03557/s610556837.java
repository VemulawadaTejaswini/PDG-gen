import java.util.*;

public class Main {
    static int n;
    static long[] a;
    static long[] b;
    static long[] c;
    static long[] dpB;
    static long[] dpA;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n];
        b = new long[n];
        c = new long[n];
        dpB = new long[n+1];
        dpA = new long[n+1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        //Bの要素iより大きいCの要素がいくつあるかを累積和でdpB[]に格納
        int indC = 0;
        for (int i = 0; i < n; i++) {
            long count = 0;
            for (int j = indC; j < n; j++) {
                if (b[i] < c[j]) {
                    count = n - j;
                    break;
                } else {
                    indC = j;
                }
            }
            if (i==0) {
                dpB[i] = count;
            } else {
                dpB[i] = count + dpB[i-1];
            }
        }
        int indB = 0;
        //Aの要素iより大きいBの要素の値をdpC[]に格納
        for (int i = 0; i < n; i++) {
            long count = 0;
            for (int j = indB; j < n; j++) {
                if (a[i] < b[j]) {
                    if (j > 0) {
                        count = dpB[n-1] - dpB[j-1];
                    } else {
                        count = dpB[n-1];
                    }
                    break;
                } else {
                    indB = j;
                }
            }
            if (i==0) {
                dpA[i] = count;
            } else {
                dpA[i] = count + dpA[i-1];
            }
        }
        System.out.println(dpA[n-1]);
    }
}

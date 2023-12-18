
import java.util.*;

public class Main {
    static int[] a;
    static int[] b;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if(n == 0 && m == 0) break;
            solve(n, m);
        }
    }

    static void solve(int n, int m) {
        a = new int[n+1];
        b = new int[(n+1)*(n+1)];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                b[i* (n + 1) + j] = a[i] + a[j];
            }
        }
        Arrays.sort(b);
        int max = -1;
        for (int i = 0; i < b.length; i++) {
            if ( b[i] > m) break;
            int index = binarySEarch(b, m - b[i]);
            max =Math.max(max, b[i] + b[index]);
        }
        System.out.println(max);
    }

    static int binarySEarch(int[] a, int b) {
        int ok = 0;
        int ng = a.length;
        int mid = 0;

        while(ng - ok > 1) {
            mid = (ng + ok) / 2;
            if(a[mid] <= b) {
                ok = mid;
            }
            else {
                ng = mid;
            }
        }
        return ok;
    }
}


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        int max = Math.max(n,m);
        long[] a = new long[max];
        long[] b = new long[max];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        for(int i=0; i<m; i++) {
            b[i] = sc.nextLong();
        }

        int cnt = 0;
        for(int i=0; i<max; i++) {
            if(k - a[i] >= 0 && a[i] != 0) {
                k -= a[i];
                cnt++;
            }
            if(k - b[i] >= 0 && b[i] != 0) {
                k -= b[i];
                cnt++;
            }
            if(k == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

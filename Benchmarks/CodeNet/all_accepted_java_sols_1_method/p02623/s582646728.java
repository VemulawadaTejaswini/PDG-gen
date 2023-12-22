import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        long[] b = new long[m];
        for(int i=0; i<m; i++) {
            b[i] = sc.nextLong();
        }

        long[] ca = new long[n+1];
        for(int i=0; i<a.length; i++) ca[i+1] = ca[i] + a[i];

        long[] cb = new long[m+1];
        for(int i=0; i<b.length; i++) cb[i+1]+= cb[i] + b[i];

        int cnt = 0;
        int j = m;
        for(int i=0; i<n+1; i++) {
            if(ca[i] > k) {
                break;
            }
            while(cb[j] > k-ca[i]) {
                j--;
            }
            cnt = Math.max(cnt, i+j);
        }
        System.out.println(cnt);
    }
}

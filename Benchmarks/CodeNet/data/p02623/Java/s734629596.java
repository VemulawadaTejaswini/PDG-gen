import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n+1];
        long[] b = new long[m+1];
        for(int i=0; i<n; i++) {
            a[i+1] = a[i] + sc.nextInt();
        }
        for(int i=0; i<m; i++) {
            b[i+1] = b[i] + sc.nextInt();
        }

        int res = 0;
        int j = m;
        for(int i=0; i<=n; i++) {
            long rem = k - a[i];
            if(rem < 0) break;
            while(j>0 && b[j] > rem) j--;
            res = Math.max(res, i + j);
        }



        System.out.println(res);

    }

}
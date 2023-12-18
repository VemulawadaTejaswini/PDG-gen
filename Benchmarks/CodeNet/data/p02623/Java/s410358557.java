import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] nn = new long[n];
        long[] mm = new long[m];
        int ans = 0;
        for(int i=0; i<n; i++) {
            nn[i] = sc.nextLong();
        }
        for(int i=0; i<m; i++) {
            mm[i] = sc.nextLong();
        }
        int nCount = 0;
        int mCount = 0;
        long sum = 0;
        int ii = n + m;
        for(int i=0; i<ii; i++) {
            long min = Long.MAX_VALUE;
            if(n > 0 && m > 0) {
                if(nn[nCount] < mm[mCount]) {
                    min = nn[nCount];
                    nCount++;
                    n--;
                } else {
                    min = mm[mCount];
                    mCount++;
                    m--;
                }
            } else if(n > 0) {
                min = nn[nCount];
                nCount++;
                n--;
            } else if(m > 0) {
                min = mm[mCount];
                mCount++;
                m--;
            }
            sum += min;
            ans++;
            if(sum > k) {
                ans--;
                break;
            }
        }
        System.out.println(ans);
    }
}
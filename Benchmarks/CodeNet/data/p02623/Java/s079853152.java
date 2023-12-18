import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long k = in.nextLong();
        
        long[] ai = new long[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
        }
        long[] asum = new long[n];
        asum[0] = ai[0];
        int amaxIndex = -1;
        for(int i=1; i<n; i++) {
            asum[i] = asum[i-1] + ai[i];
            if(asum[i] <= k) {
                amaxIndex = i;
            }
        }
        
        long[] bi = new long[m];
        for(int i=0; i<m; i++) {
            bi[i] = in.nextLong();
        }
        long[] bsum = new long[m];
        bsum[0] = bi[0];
        int bmaxIndex = -1;
        for(int i=1; i<m; i++) {
            bsum[i] = bsum[i-1] + bi[i];
            if(bsum[i] <= k) {
                bmaxIndex = i;
            }
        }
        
        int maxCount = 0;
        for(int i=-1; i<=amaxIndex; i++) {
            // 二分探索　：　机Bで何冊読めるか？
            // -1は、その机の本は1冊も読まない状態
            int l = -1;
            int r = bmaxIndex;
            while(l<r) {
                int mid = (l+r)/2;
                if(l+1==r) {
                    if((i==-1 ? 0 : asum[i]) + (r==-1 ? 0 : bsum[r]) > k) {
                        r = l;
                    }
                    break;
                }
                if((i==-1 ? 0 : asum[i]) + (mid==-1 ? 0 : bsum[mid]) <= k) {
                    l = mid;
                }
                else {
                    r = mid;
                }
            }
            maxCount = Math.max(maxCount, (i+1)+(r+1));
        }
        System.out.println(maxCount);
    }
}

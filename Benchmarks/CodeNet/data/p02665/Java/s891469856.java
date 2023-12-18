import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        for(int i=0; i<=n; i++) {
            a[i] = in.nextInt();
        }
        if(n==0) {
            System.out.println(a[0]==1 ? 1 : -1);
            return;
        }
        
        // n>0
        
        // ループ中の、現時点の深さでの、有り得る最小頂点数と最大頂点数
        long[] minNodes = new long[n+1];
        long[] maxNodes = new long[n+1];
        minNodes[0] = 1;
        maxNodes[0] = 1;
        if(a[0] != 0) {
            System.out.println(-1);
            return;
        }
        
        // 頂点が足らなくなることを検知
        for(int i=1; i<=n; i++) {
            int ai_1 = a[i-1];
            int ai = a[i];
            maxNodes[i] = (maxNodes[i-1]-ai_1)*2;
            minNodes[i] = Math.max(0, minNodes[i-1]-ai_1);
            if(maxNodes[i]-ai < 0) {
                System.out.println(-1);
                return;
            }
            if(i<n && maxNodes[i]-ai <= 0) {
                System.out.println(-1);
                return;
            }
        }
        
        long ans = a[n];
        long childNodeCount = a[n];
        for(int i=n-1; i>=0; i--) {
            if(childNodeCount > (maxNodes[i]-a[i])*2 ) {
                System.out.println(-1);
                return;
            }
            long currentNodeCount = Math.min(maxNodes[i], childNodeCount+a[i]);
            ans += currentNodeCount;
            childNodeCount = currentNodeCount;
        }
        
        System.out.println(ans);
    }
}

import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }

        long[] sum = new long[n-k+1];
        for(int i=0;i<k;i++){
            sum[0]+=p[i];
        }

        for(int i=1;i<n-k+1;i++){
            sum[i] = sum[i-1]-p[i-1]+p[i+k-1];
        }

        float mx = sum[0];
        for(int i=0;i<n-k+1;i++){
            mx = Math.max(mx, sum[i]);
        }

        System.out.println(mx/2f + 0.5f*k);
    }
}

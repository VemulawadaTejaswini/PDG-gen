import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n],y = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        long ans = (long)4e18;
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)for(int s=0;s<n;s++)
            for(int t=0;t<n;t++){
                int x1 = Math.min(Math.min(x[i], x[j]), Math.min(x[s], x[t]));
                int x2 = Math.max(Math.max(x[i], x[j]), Math.max(x[s], x[t]));
                int y1 = Math.min(Math.min(y[i], y[j]), Math.min(y[s], y[t]));
                int y2 = Math.max(Math.max(y[i], y[j]), Math.max(y[s], y[t]));
                int c=0;
                for(int u=0;u<n;u++){
            		if(x1<=x[u] && x[u]<=x2 && y1<=y[u] && y[u]<=y2)
            			c++;
                }
                if(c>=k)
                    ans=Math.min(ans, (long)(x2-x1) * (y2-y1));
            }
        System.out.println(ans);
    }
}

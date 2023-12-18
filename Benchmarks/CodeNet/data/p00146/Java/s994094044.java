import java.util.*;
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int[] m = new int[n];
        int[] d = new int[n];
        int[] w = new int[n];
        for(int i=0;i<n;i++){
            m[i] = sc.nextInt();
            d[i] = sc.nextInt();
            w[i] = 20*sc.nextInt();
        }
         
        double[][] dp = new double[1<<n][n];
        int[][] pre = new int[1<<n][n];
        for(int i=0;i<(1<<n);i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
         
        for(int i=0;i<n;i++) dp[(int)Math.pow(2,i)][i] = 0;
         
        double p, q;
        for(int k=1;k<1<<n;k++){
            int j = k;
            int sum = 0;
            for(int i=0;i<n;i++){
                if((j>>i&1)==1) sum+=w[i]; 
            }
             
            for(int v=0;v<n;v++){
                if(dp[j][v]!=Integer.MAX_VALUE && (j>>v&1)==1){
                    for(int u=0;u<n;u++){
                        if(u!=v && (j>>u&1)==0){
                            p = dp[j|(1<<u)][u];
                            q = dp[j][v] + Math.abs(d[v]-d[u])/(2000.0/(double)(70+sum));
                            if(p>q){
                                dp[j|(1<<u)][u] = q;
                                pre[j|(1<<u)][u] = v;
                            }
                        }
                    }
                }
            }
        }
 
        double min = Integer.MAX_VALUE;
        int num = -1;
        for(int i=0;i<n;i++){
            if(min > dp[(1<<n)-1][i]){
                min = dp[(1<<n)-1][i];
                num = i;
            }
        }
         
        LinkedList<Integer> list = new LinkedList<Integer>();
        int s = (1<<n)-1;
        int t;
        for(int i=0;i<n;i++){
            list.push(num);
            t = num;
            num = pre[s][num];
            s = s&~(1<<t);
        }
         
        for(int i=0;i<n;i++){
            if(i!=0) System.out.print(" ");
            System.out.print(m[list.pollFirst()]);
        }
        System.out.println();
    }   
}
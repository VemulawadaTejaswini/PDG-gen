import java.util.*;

class Main
{
    public static void main(String [ ]args)
    {
        Scanner  sc  = new Scanner (System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cost [] =new int [N];
        int []dp  = new int [N];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i=0;i<N;i++)
            cost[i] = sc.nextInt();
        dp [0] = 0;
        dp[1]= Math.abs(cost[1]-cost[0]);
        for(int i=2;i<N;i++)
        {   
           /* for(int j=0, c =i-1 ;c>=0 && j<K;c--,j++)
            {
                dp[i] = Math.min(dp[i],dp[c]+ Math.abs(cost[i]-cost[c]));
                
            }*/
             for(int j = i - 1, jump = 0; j  >= 0 && jump < K; j--, jump++){
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(cost[j] - cost[i]));
              }
        }

        //for(int i=0;i<N;i++)
         //   System.out.println(dp[i]);
        System.out.println(dp[N-1]);

    }

}

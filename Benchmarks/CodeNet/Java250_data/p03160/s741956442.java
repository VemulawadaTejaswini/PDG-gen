import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int n = 0;
     if(sc.hasNextInt())
            n = sc.nextInt();
        int[] dp = new int[n];
     for(int i = 0 ; i < n ; i++)
     {
         dp[i] = sc.nextInt();
     }
     int[] x = new int[n];
     Arrays.fill(x,Integer.MAX_VALUE);
     x[0] = 0;
     for(int i = 0 ; i < n ; i++)
     {
         for(int j = i+1 ; j < i+3 ; j++)
         {
             if(j < n)
             {
                 x[j] = Math.min(x[j] , x[i]+Math.abs(dp[i]- dp[j]));
             }
         }
     }
     System.out.println(x[n-1]);


    }
}

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i <n; i++)
        {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] m = new int[q];
        for(int i = 0; i <q; i++)
        {
            m[i] = sc.nextInt();
        }
        sc.close();
        boolean[][] dp = new boolean[22][2010];
        
        for(int i= 0;i < n;i++)
        {
            for(int j = 0; j < 2010; j++) 
            {
                dp[i][j] = false;
            }
        }
        dp[0][0] = true;

        for(int i= 0;i < n;i++)
        {
            for(int j = 0; j < 2010; j++) 
            {
                if(j - A[i] >= 0)
                {
                    dp[i+1][j] |= dp[i][j-A[i]];
                }
                dp[i+1][j] |= dp[i][j];
            }
        }
        for(int i = 0;i<q;i++)
        {
            if(dp[n][m[i]])
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        /*
        for(int i= 0;i < n+1;i++)
        {
            for(int j = 0; j < 20; j++) 
            {
                if(dp[i][j])System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
        */
    

    }
}

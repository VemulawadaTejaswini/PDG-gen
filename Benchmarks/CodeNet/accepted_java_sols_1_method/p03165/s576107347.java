import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char[] arr1 = in.nextLine().toCharArray();
        char[] arr2 = in.nextLine().toCharArray();
        in.close();
        StringBuilder sb = new StringBuilder();
        int len1 = arr1.length, len2 = arr2.length, maxl = 0;
        
        int[][] dp = new int[len1+1][len2+1];

        
        for(int i = 1; i <= len1; i++)
        {
            for(int j = 1; j <= len2; j++)
            {
                if(arr1[i-1] == arr2[j-1])
                {   
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }

        }
        //TO DO: constructing the path
        while(dp[len1][len2] > 0){
            if(arr1[len1-1] == arr2[len2-1]){
                sb.append(arr1[len1-1]);
                len1--;
                len2--;
            }
            else{
                if(dp[len1][len2] == dp[len1][len2-1]){
                    len2--;
                }
                else{
                    len1--;
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] a = new int[n][m];
        int[] b = new int[m];

        for(int i = 0; i < n; i++)
        {
            String str2[] = br.readLine().split(" ");
            for(int j = 0; j < m; j++)
            {
                a[i][j] = Integer.parseInt(str2[j]);
            }
        }
        
        for(int k = 0; k < m; k++)
        {
            String str3 = br.readLine();
            b[k] = Integer.parseInt(str3);
        }
        
        for(int i = 0; i < n; i++)
        {
            int ans = 0;
            for(int j = 0; j < m; j++)
            {
                ans += a[i][j] * b[j];
            }
            System.out.println(ans);
        }
    }
}
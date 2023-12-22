import java.io.*;
class Main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int n = s.length();
        long[][] DP = new long[2][n];
        DP[0][0] = 1;
        DP[1][0] = 0;
        DP[0][1] = (s.charAt(1) == s.charAt(0))? 0 : 2;
        DP[1][1] = 1;
        for (int i=2;i<n;i++)
        {
            if (DP[0][i - 1] > DP[1][i - 1] && s.charAt(i) != s.charAt(i - 1))  DP[0][i] = DP[0][i - 1] + 1;
            else    DP[0][i] = DP[1][i - 1] + 1;

            if (DP[1][i - 2] > DP[0][i - 2] && !s.substring(i-3,i - 1).equals(s.substring(i - 1, i + 1)))   DP[1][i] = DP[1][i - 2] + 1;
            else    DP[1][i] = DP[0][i - 2] + 1;
        }
        System.out.println(Math.max(DP[0][n - 1], DP[1][n - 1]));
    }
}

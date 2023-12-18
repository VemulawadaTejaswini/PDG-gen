import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        final Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n+1];
        int[][] m=new int[n+1][n+1];

for(int i = 1; i <= n; i++)
    {
        p[i - 1] = sc.nextInt();
        p[i] = sc.nextInt();
    }

for(int i = 1; i <= n; i++) m[i][i] = 0;

for(int j = 2; j <= n; j++)
    {
        for(int i = 1; i <= n - j + 1; i++)
            {
                int k = i + j - 1;
                m[i][k] = 200000;
                for(int l = i; l <= k - 1; l++)
                    {
                        m[i][k] = ((m[i][k] < m[i][l] + m[l + 1][k] + p[i - 1] * p[l] * p[k]) ? m[i][k] : (m[i][l] + m[l + 1][k] + p[i - 1] * p[l] * p[k]));
                    }
            }
    }
System.out.println(m[1][n]);
}
}
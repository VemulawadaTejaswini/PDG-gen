import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[m][l];
        long ans[][] = new long[n][l];
        int i=0,j=0,k=0;
        for(i = 0 ; i < n ; i++)
        {
            for(j = 0 ; j < m ; j++)
                a[i][j] = sc.nextInt();
        }
        for(i = 0 ; i < m ; i++)
        {
            for(j = 0 ; j < l ; j++)
                b[i][j] = sc.nextInt();
        }
        for(i = 0 ; i < n ; i++)
        {
            for(j = 0 ; j < l ; j++)
                ans[i][j] = 0;
        }
        for(i = 0 ; i < n ; i++)
        {
            for(j = 0 ; j < l ; j++)
            {
                for(k = 0 ; k < m ; k++)
                    ans[i][j] += a[i][k] * b[k][j];
            }
        }
        for(i = 0 ; i < n ; i++)
        {
            for(j = 0 ; j < l-1 ; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println(ans[i][l-1]);
        }
    }
}

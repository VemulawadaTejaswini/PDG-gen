import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        
        for(int i = 0; i<=n; i++)
        {
            for(int j = 0; j<=m; j++)
            {
                if(i*m + j*n - 2*i*j == k)
                {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
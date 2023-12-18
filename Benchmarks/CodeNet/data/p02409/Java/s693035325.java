import java.util.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int[][][] house = new int[5][4][11];
        int n = scanner.nextInt();
        int b, f, r, v;
        String sharp = "####################";
        
        for(int i = 0; i < n; i++)
        {
            b = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();
            v = scanner.nextInt();
            
            house[b][f][r] += v;
        }
        
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 3; j++)
            {
                for(int k = 1; k <= 10; k++)
                {
                    System.out.print(" ");
                    System.out.print(house[i][j][k]);
                }
                System.out.println();
            }
            if (i != 4)
            {
                System.out.println(sharp);
            }
        }
    }
}


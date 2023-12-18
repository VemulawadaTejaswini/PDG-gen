import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int home[][][] = new int[4][3][10];
        int b = 0;
        int f = 0;
        int r = 0;
        int v = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        for(i = 0 ; i < 4 ; i++)
        {
            for(j = 0 ; j < 3 ; j++)
            {
                for(k = 0 ;k < 10 ; k++)
                    home[i-1][j-1][k-1] = 0;
            }
        }
        int n = sc.nextInt();
        for(i = 0 ; i < n ; i++)
        {
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            home[b][f][r] += v;
        }
        for(i = 0 ; i < 4 ; i++)
        {
            for(j = 0 ; j < 3 ; j++)
            {
                for(k = 0 ; k < 10 ; k++)
                    System.out.print(" " + home[i][j][k]);
                System.out.println();
            }
            if(i != 3)
            {   
                System.out.println("####################");
            }
        }
    }
}

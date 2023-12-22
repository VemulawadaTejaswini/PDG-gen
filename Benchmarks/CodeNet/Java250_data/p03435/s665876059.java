import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
                c[i][j] = sc.nextInt();
            }
        }

        String ans = "Yes";
        boolean bl = true;

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
               if (c[j][i] - c[j][i+1] != c[j+1][i] - c[j+1][i+1]
                || c[i][j] - c[i+1][j] != c[i][j+1] - c[i+1][j+1])
                {
                        ans = "No";
                        break;
                }
            }
        }
        System.out.println(ans);
    }
}
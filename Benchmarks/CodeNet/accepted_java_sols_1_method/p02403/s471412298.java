import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0 && W==0) break;

            int i,k;
            for(i=0; i<H; i++)
            {
                for(k=0; k<W; k++) System.out.printf("#");
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,k;

        while(true)
        {
            int H = sc.nextInt();
            int W = sc.nextInt();
    
            if(H==0 && W==0) break;

            for(i=0; i<H; i++)
            {
                for(k=0; k<W; k++)
                {
                    if(i%2 == 0)
                    {
                        if(k%2==0) System.out.printf("#");
                        else if(k%2==1) System.out.printf(".");
                    }                
                    else if(i%2 == 1)
                    {
                        if(k%2==0) System.out.printf(".");
                        else if(k%2==1) System.out.printf("#");
                    }
                }
                System.out.print("\n");
            }

            System.out.printf("\n");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int H;
        int W;
        while(true)
        {
            H = sc.nextInt();
            W = sc.nextInt();
            if(H==0&&W==0)break;
            for(int j=0;j<W;j++)
            {
                System.out.print("#");
            }
            System.out.println();
            for(int i=0;i<H-2;i++)
            {
                System.out.print("#");
                for(int j=0;j<W-2;j++)
                {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println();
            }
            for(int j=0;j<W;j++)
            {
                System.out.print("#");
            }
            System.out.println();
            System.out.println();
        }
    }
}
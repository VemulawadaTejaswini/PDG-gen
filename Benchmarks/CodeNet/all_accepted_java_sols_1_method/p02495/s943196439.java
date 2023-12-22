import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int H = sc.nextInt(), W = sc.nextInt();
            if(H==0&&W==0)return;
            for(int h=0;h<H;h++)
            {
                for(int w=0;w<W;w++)
                {
                    System.out.print((h+w)%2==0?'#':'.');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
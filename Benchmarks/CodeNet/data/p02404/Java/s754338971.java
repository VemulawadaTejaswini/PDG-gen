import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int i = 0,j = 0;
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0)
                break;
            for(i = 0 ; i < H ; i++)
            {
                if(i == 0 || i == (H - 1))
                {
                    for(j = 0 ; j < W ; j++)
                        System.out.print("#");
                }
                else
                {
                    System.out.print("#");
                    for(j = 0 ; j < W - 2; j++)
                        System.out.print(".");
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

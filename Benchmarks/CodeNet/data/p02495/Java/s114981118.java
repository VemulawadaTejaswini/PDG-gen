import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int H,W;
        Scanner sc=new Scanner(System.in);
        
        do
        {
            H=sc.nextInt();
            W=sc.nextInt();
            
            
            for(int j=0;j<H;j++)
            {
                if(j%2==0)
                {
                    for(int i=0;i<W;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.print("#");
                        }
                        else
                        {
                            System.out.print(".");
                        }
                    }
                }
                else
                {
                    for(int i=0;i<W;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.print(".");
                        }
                        else
                        {
                            System.out.print("#");
                        }
                    }
                }
                System.out.print("\n");
            }    
            System.out.print("\n");
        }while(H!=0 && W!=0);
    }
}
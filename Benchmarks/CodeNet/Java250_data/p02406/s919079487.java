import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i=1;
        int jud=0;
        int x=0;
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        while(true)
        {
            //CHECK_NUM
            if(jud==0)
            {
                i++;
                x=i;
            }
            
            if(x%3==0 && jud!=-1)
            {
                System.out.printf(" %d",i);
                jud=0;
            }
            else
            {
                if(x%10==3)
                {
                    System.out.printf(" %d",i);
                    jud=0;
                    //goto END_CHECK_NUM
                }
                else
                {
                    x/=10;
                    if(x!=0)
                    {
                        jud=-1;
                    }   //goto INCLUDE3
                    else
                    {
                        jud=0;
                    }
                }
            }
            
            //END_CHECK_NUM
            
            if(i+1>n)
            {
                break;
            }
            //goto CHECK_NUM
        }
        System.out.print("\n");
    }
}
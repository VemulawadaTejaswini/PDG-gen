import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
            for(int i=0;i<1000;i++)
            {
                if((a+i)%1000==0)
                { 
                    System.out.println(i);
                    System.exit(0);
                }
            }
    }
}

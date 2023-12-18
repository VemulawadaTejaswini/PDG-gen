import java.util.*;
public class Main
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%1000==0)
            System.out.println("0");
        else
        {
            for(int i=1;i<a;i++)
            if((a+i)%1000==0)
                System.out.println(i);
        }
     }
}
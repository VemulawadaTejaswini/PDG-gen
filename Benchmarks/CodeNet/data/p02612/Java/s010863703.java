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
            if((a+100)%1000==0)
                System.out.println("100");
            else if((a+200)%1000==0)
                System.out.println("200");
            else if((a+300)%1000==0)
                System.out.println("300");
            else if((a+400)%1000==0)
                System.out.println("400");
            else if((a+500)%1000==0)
                System.out.println("500");
            else if((a+600)%1000==0)
                System.out.println("600");
            else if((a+700)%1000==0)
                System.out.println("700");
            else if((a+800)%1000==0)
                System.out.println("800");
            else if((a+900)%1000==0)
                System.out.println("900");
        }
     }
}
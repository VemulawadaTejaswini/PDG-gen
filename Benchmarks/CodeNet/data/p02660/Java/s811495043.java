import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       int x=(int)Math.sqrt(n);
       int copyx=x;
       int ans=0;
       for(int i=2;i<=x;i++)
       {
           int count=1;
           while(n%((long)(Math.pow(i,count)))==0)
           {

               n= (long) (n/Math.pow(i,count));
               count++;
               ans++;
           }
       }

       if(x==1)
       {
           System.out.println(ans);
       }
       else
       if(ans==0)
       {
           System.out.println(1);
       }
       else
       {
           System.out.println(ans);
       }

    }
}

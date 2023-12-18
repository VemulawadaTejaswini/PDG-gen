import java.util.Scanner;

public class D {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       long copyn=n;
       long x=(long)Math.sqrt(n);
       long copyx=x;
       long ans=0;
       for(int i=2;i<=x;i++)
       {
           int count=1;
           while(n%((Math.pow(i,count)))==0)
           {

               n= (long) (n/Math.pow(i,count));
               count++;
               ans++;
           }
       }

       if(copyn==1)
       {
           System.out.println(0);
       }
       else

       if(n>x)
       {
           System.out.println(1+ans);
       }
       else
       {
           System.out.println(ans);
       }

    }
}

import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        long sum=0,x,m,n,A;
        n=sc.nextLong();
        x=sc.nextLong();
        m=sc.nextLong();
        A=x;
        for(int i=0;i<n;i++)
        {
            sum+=A%m;
            A=A*A;
        }
        System.out.println(sum);
    }
}
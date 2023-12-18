import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner obj=new Scanner(System.in);
        Main ob=new Main();
        int i,s=0,d;
        int N=obj.nextInt();
        for(i=1;i<=N;i++)
        {
            d=ob.divisor(i);
            s+=i*d;
        }
      System.out.println(s);
    }
    int divisor(int k)
    {
        int c=0;
        for(int x=1;x<=k;x++)
        {
            if (k%x==0)
                c++;
        }
        return c;
    }
}
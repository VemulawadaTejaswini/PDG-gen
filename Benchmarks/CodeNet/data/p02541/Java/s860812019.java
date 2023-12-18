import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long c=0;
        while((n>0) && ((n%2)==0))
        {
            n/=2;
            c++;
        }
        c++;
        long p=n;
        long q=(1L<<c);
        long ans=-1;
        for(int i=1;i<p;i++)
        {
            if(((((q*i)%p)*(q*i-1))%p)==0)
            {
                ans=q*i-1;
                break;
            }
            if(((((q*i)%p)*(q*i+1))%p)==0)
            {
                ans=q*i;
                break;
            }
        }
        if(ans==-1L)
        {
            System.out.println(p*q-1L);
        }
        else
            System.out.println(ans);
    }
}

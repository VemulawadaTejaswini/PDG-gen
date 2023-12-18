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
        long p=Math.min(n, (long)Math.pow(2,c));
        long q=Math.max(n, (long)Math.pow(2,c));
        long ans=-1;
        for(long i=1;i<q;i++)
        {
            if((p*i*(p*i-1L)%q)==0L)
            {
                ans=p*i-1L;
                break;
            }
            if((p*i*(p*i+1L)%q)==0L)
            {
                ans=p*i;
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

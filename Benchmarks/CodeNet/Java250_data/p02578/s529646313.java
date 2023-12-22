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
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextLong();
        long curr=a[0];
        long total=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>=curr)
                curr=a[i];
            else
            {
                total+=(curr-a[i]);
            }
        }
        System.out.println(total);

    }
}

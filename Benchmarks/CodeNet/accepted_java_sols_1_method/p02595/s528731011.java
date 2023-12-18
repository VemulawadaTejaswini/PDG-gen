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
        long d=in.nextLong();
        long[] x=new long[n];
        long[] y=new long[n];
        for(int i=0;i<n;i++)
        {
            x[i]=in.nextLong();
            y[i]=in.nextLong();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if((long)x[i]*x[i]+(long)y[i]*y[i]<=(long)d*d)
                c++;
        }
        System.out.println(c);
    }
}
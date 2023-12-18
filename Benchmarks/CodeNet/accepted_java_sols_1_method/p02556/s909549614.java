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
        int n=in.nextInt();
        long[] x=new long[n];
        long[] y=new long[n];
        TreeSet<Long> set1=new TreeSet<>();
        TreeSet<Long> set2=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            x[i]=in.nextLong();
            y[i]=in.nextLong();
            set1.add(x[i]+y[i]);
            set2.add(x[i]-y[i]);
        }
        System.out.println(Math.max(set1.last()-set1.first(), set2.last()-set2.first()));
        

    }
}
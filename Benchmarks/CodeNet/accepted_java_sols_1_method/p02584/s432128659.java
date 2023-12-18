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
        long x=in.nextLong();
        long k=in.nextLong();
        long d=in.nextLong();
        if(x<0)
        {
            long y=Math.abs(x)/d;
            long x1=x+y*d;
            if(y>=k)
                System.out.println(Math.abs(x+k*d));
            else
            {
                if(((k-y)&1)==0)
                    System.out.println(Math.abs(x1));
                else
                    System.out.println(x1+d);
            }
        }
        else if(x>0)
        {
            long y=x/d;
            long x1=x-y*d;
            if(y>=k)
                System.out.println(x-k*d);
            else
            {
                if(((k-y)&1)==0)
                    System.out.println(x1);
                else
                    System.out.println(Math.abs(x1-d));
            }
        }
        else
        {
            if((k&1)==0)
                System.out.println(0);
            else
                System.out.println(d);
        }
    }
}

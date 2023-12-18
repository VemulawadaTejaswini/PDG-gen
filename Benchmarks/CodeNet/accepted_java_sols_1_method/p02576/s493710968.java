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
        int x=in.nextInt();
        int t=in.nextInt();
        int ans=0;
        if(n%x==0)
            ans=n/x;
        else
            ans=1+n/x;
        ans*=t;
        System.out.println(ans);
    }
}

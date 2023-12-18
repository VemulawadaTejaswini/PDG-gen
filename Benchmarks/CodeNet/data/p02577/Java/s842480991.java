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
        String str=in.next();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int d=str.charAt(i)-48;
            sum+=d;
            sum%=9;
        }
        if(sum==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

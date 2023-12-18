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
        String s=in.next();
        if(s.equals("SSS"))
            System.out.println("0");
        if(s.equals("SSR"))
            System.out.println("1");
        if(s.equals("SRS"))
            System.out.println("1");
        if(s.equals("RSS"))
            System.out.println("1");
        if(s.equals("SRR"))
            System.out.println("2");
        if(s.equals("RSR"))
            System.out.println("1");
        if(s.equals("RRS"))
            System.out.println("2");
        if(s.equals("RRR"))
            System.out.println("3");
        
        
    }
}

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
        String c=in.next();
        int front=-1;
        int rear=-1;
        for(int i=0;i<n;i++)
        {
            if(c.charAt(i)=='W')
            {
                front=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(c.charAt(i)=='R')
            {
                rear=i;
                break;
            }
        }
        if(front==-1 || rear==-1)
            System.out.println(0);
        else
        {
            int w=0;
            int r=0;
            for(int i=front;i<=rear;i++)
            {
                if(c.charAt(i)=='W')
                    w++;
                else
                    r++;
            }
            int cnt=0;
            for(int i=front;i<front+r;i++)
            {
                if(c.charAt(i)=='W')
                    cnt++;
            }
            System.out.println(cnt);
        }
            
    }
}
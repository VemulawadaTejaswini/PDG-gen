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
        int k=in.nextInt();
        if((k&1)!=0)
        {
            long num=0L;
            boolean flag=false;
            int i=1;
            for(i=1;i<=k;i++)
            {
                num=num*10;
                num%=k;
                num+=7;
                num%=k;
                if(num==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
                System.out.println(i);
            else
                System.out.println(-1);
        }
        else
           System.out.println(-1); 

    }
}
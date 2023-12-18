import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.*;
public class Main {
    public static long num[] = new long[1023];
    public static int k=0;
    public static void main(String args[])throws IOException
    {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        int n = (int)in.nval;
        long sum=1;
        boolean dui = false;
        long m = 1;
        m = 1000000000*1000000000;
        for(int i=0;i<n;i++)
        {
            in.nextToken();
            long a = (long)in.nval;
            if(a!=0&&m/a<sum)
            {
                dui = true;
            }
            else{
                sum*=a;
            }
            
        }
        if(sum==0)
            out.println(0);
        else{
            if(dui==true)
                out.println(-1);
            else
                out.println(sum);
        }
        out.flush();
    }
                  }
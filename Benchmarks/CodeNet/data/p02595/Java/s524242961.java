import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        long d=Long.parseLong(str[1]);
        int c=0;
        for(int i=0;i<n;i++)
        {
            str=br.readLine().split(" ");
            long x=Long.parseLong(str[0]);
            long y=Long.parseLong(str[1]);
            if(x*x+y*y<=d*d)
            c++;
        }
        pw.println(c);
        pw.flush();
        pw.close();
    }
}
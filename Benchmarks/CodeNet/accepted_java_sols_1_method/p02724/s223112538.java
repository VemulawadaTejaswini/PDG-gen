import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        int n=Integer.parseInt(s);
        long five=(long)n/500;
        n%=500;
        long t=(long)n/5;
        pw.println(five*1000+t*5);
        pw.flush();
        pw.close();
    }
}
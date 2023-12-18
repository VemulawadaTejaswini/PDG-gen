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
        int x=Integer.parseInt(str[1]);
        int t=Integer.parseInt(str[2]);
        pw.println((int)Math.ceil((double)n/x)*t);
        pw.flush();
        pw.close();
    }
}
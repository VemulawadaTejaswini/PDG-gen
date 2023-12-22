import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        if(s.length()<=n)
        pw.println(s);
        else
        pw.println(s.substring(0,n)+"...");
        pw.flush();
        pw.close();
    }
}
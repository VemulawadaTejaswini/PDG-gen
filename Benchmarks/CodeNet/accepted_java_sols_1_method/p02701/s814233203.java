import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        TreeSet<String> set=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            String s=br.readLine();
            set.add(s);
        }
        pw.println(set.size());
        pw.flush();
        pw.close();
    }
}
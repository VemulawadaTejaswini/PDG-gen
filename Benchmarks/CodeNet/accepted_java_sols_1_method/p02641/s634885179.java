import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int x=Integer.parseInt(str[0]);
        int n=Integer.parseInt(str[1]);
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<=101;i++)
        ts.add(i);
        str=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        ts.remove(new Integer(Integer.parseInt(str[i])));
        int t1=ts.floor(x);
        int t2=ts.ceiling(x);
        if((int)Math.abs(t1-x)<(int)Math.abs(t2-x))
        pw.println(t1);
        else if((int)Math.abs(t1-x)>(int)Math.abs(t2-x))
        pw.println(t2);
        else
        pw.println(Math.min(t1,t2));
        pw.flush();
        pw.close();
    }
}
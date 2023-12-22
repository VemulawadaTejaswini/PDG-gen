import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        int max=0,cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            cnt++;
            else
            cnt=0;
            max=Math.max(max,cnt);
        }
        pw.println(max);
        pw.flush();
        pw.close();
    }
}
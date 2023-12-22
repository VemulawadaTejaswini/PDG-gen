import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ars[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //String str[]=br.readLine().split(" ");
        long n=Long.parseLong(br.readLine());
        //int k=Integer.parseInt(str[1]);
        StringBuffer sb=new StringBuffer();
        while(n>0)
        {
            int mod=(int)((n-1)%26);
            sb.append((char)(mod+97));
            n=(n-1)/26;
        }
        sb.reverse();
        pw.println(sb.toString());
        pw.flush();
        pw.close();
    }
}
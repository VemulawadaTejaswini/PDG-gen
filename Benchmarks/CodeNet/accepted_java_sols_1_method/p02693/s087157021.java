import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int q=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        if(a%q==0||b%q==0||b/q-a/q>0)
        pw.println("OK");
        else
        pw.println("NG");
        /*for(int x=0;x<q;x++)
        {
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            String s=br.readLine();
        }*/
        pw.flush();
        pw.close();
    }
}
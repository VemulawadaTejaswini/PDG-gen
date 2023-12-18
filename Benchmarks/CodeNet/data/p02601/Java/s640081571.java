import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);
        int k=Integer.parseInt(br.readLine());
        while(k>0&&b<=a)
        {
            b*=2;
            k--;
        }
        while(k>0&&c<=b)
        {
            c*=2;
            k--;
        }
        if(a<b&&b<c)
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(br.readLine());
        if(n%2==0||n%5==0)
        pw.println(-1);
        else
        {
            int ans=-1;
            long cur=7;
            for(int i=1;i<=(int)1e6;i++)
            {
                if(cur%n==0)
                {
                    ans=i;
                    break;
                }
                cur*=10;
                cur+=7;
                cur%=n;
            }
            pw.println(ans);
        }
        pw.flush();
        pw.close();
    }
}
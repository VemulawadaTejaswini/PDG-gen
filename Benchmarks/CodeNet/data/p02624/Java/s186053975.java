import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        long sum=1;
        for(int j=2;j<=n;j++)
        {
            int sqrt=(int)Math.ceil(Math.sqrt(j));
            int cntr;
            if(sqrt*sqrt==j)
            cntr=1;
            else
            cntr=0;
            for(int i=1;i<sqrt;i++)
            {
                if(j%i==0)
                cntr+=2;
            }
            sum=sum+j*cntr;
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}
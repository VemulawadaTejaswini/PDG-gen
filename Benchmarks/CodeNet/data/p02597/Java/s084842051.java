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
        char c[]=br.readLine().toCharArray();
        int r=0,w=0;
        for(int i=0;i<n;i++)
        {
            if(c[i]=='R')
            r++;
            else
            w++;
        }
        if(w==0||r==0)
        pw.println(0);
        else
        {
            int cntr=0;
            for(int i=0;i<r;i++)
            {
                if(c[i]=='W')
                cntr++;
            }
            pw.println(cntr);
        }
        pw.flush();
        pw.close();
    }
}
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        str=br.readLine().split(" ");
        int elev[]=new int[n+1];
        for(int i=1;i<=n;i++)
        elev[i]=Integer.parseInt(str[i-1]);
        boolean isgreat[]=new boolean[n+1];
        Arrays.fill(isgreat,true);
        for(int i=0;i<k;i++)
        {
            str=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            if(elev[a]>elev[b])
            isgreat[b]=false;
            else if(elev[a]<elev[b])
            isgreat[a]=false;
            else
            {
                isgreat[a]=false;
                isgreat[b]=false;
            }
        }
        int cntr=0;
        for(int i=1;i<=n;i++)
        if(isgreat[i])
        cntr++;
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}
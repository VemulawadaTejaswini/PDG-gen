import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
        arr[i]=Integer.parseInt(str[i-1]);
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        long ans=0;
        for(int i=1;i<=n;i++)
        {
            ans+=(long)tmap.getOrDefault(i-arr[i],0);
            tmap.put(i+arr[i],tmap.getOrDefault(i+arr[i],0)+1);
        }
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}
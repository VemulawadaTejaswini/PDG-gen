import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        int cntr[]=new int[200001];
        int arr[]=new int[n];
        long sum=0;
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            cntr[arr[i]]++;
        }
        for(int i=1;i<=200000;i++)
        sum+=(long)(cntr[i]-1)*cntr[i]/2;
        for(int i=0;i<n;i++)
        pw.println(sum-cntr[arr[i]]+1);
        pw.flush();
        pw.close();
    }
}

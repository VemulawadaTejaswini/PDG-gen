import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ars[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        str=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<k;i++)
        sum+=arr[i];
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}
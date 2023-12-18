import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        int mx=(int)1e7+1;
        int arr[]=new int[mx];
        Arrays.fill(arr,1);
        for(long i=2;i<=mx-1;i++)
        {
            for(long j=i;j<=mx-1;j+=i)
            arr[(int)j]++;
        }
        long sum=1;
        for(int i=2;i<=n;i++)
        sum=sum+(1L*arr[i]*i);
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}
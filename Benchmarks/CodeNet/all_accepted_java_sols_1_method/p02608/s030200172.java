import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String arggs[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int mx=(int)1e4;
        int arr[]=new int[mx+1];
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=100;j++)
            {
                for(int k=1;k<=100;k++)
                {
                    int ans=i*i+j*j+k*k+i*j+j*k+i*k;
                    if(ans<=mx)
                    arr[ans]++;
                }
            }
        }
        int n=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++)
        pw.println(arr[i]);
        /*int arr[]=new int[n];
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        int cntr=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0&&arr[i]%2!=0)
            cntr++;
        }
        pw.println(cntr);*/
        pw.flush();
        pw.close();
    }
}
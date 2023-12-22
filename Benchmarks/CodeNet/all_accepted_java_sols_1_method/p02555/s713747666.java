import java.util.*;
import java.io.*;
public class Main
{
    static final long mod=(long)1e9+7;
    public static void main(String argd[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int s=Integer.parseInt(br.readLine());
        long arr[]=new long[2001];
        Arrays.fill(arr,1);
        arr[1]=arr[2]=0;
        arr[0]=1;
        for(int i=1;i<=2000;i++)
        {
            boolean done[]=new boolean[2001];
            for(int j=3;j<=(i+1)/2;j++)
            {
                if(j>=3)
                {
                    if(i-j==j&&!done[j])
                    {
                        arr[i]=(arr[j]+arr[i])%mod;
                        done[j]=true;
                    }
                    else if(i-j>=3&&!done[j]&&!done[i-j])// if(i-j>=3&&!done[j]&&!done[i-j])
                    {
                        arr[i]+=arr[j]+arr[i-j];
                        arr[i]%=mod;
                        done[j]=done[i-j]=true;
                    }
                }
            }
        }
        pw.println(arr[s]);
        pw.flush();
        pw.close();
    }
}
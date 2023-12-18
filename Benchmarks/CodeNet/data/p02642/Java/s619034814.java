import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        HashMap<Integer,Integer> ind=new HashMap<>();
        int n=Integer.parseInt(br.readLine());
        int cnt[]=new int[1000001];
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            cnt[Integer.parseInt(str[i])]++;
            arr[i]=Integer.parseInt(str[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(cnt[arr[i]]==1)
            {
                boolean got=true;
                for(int j=2;j<=(int)Math.ceil(Math.sqrt(arr[i]));j++)
                {
                    if(arr[i]%j==0)
                    {
                        if(j!=arr[i]&&cnt[j]>0||cnt[arr[i]/j]>0)
                        {
                            got=false;
                            break;
                        }
                    }
                }
                if(got)
                ans++;
            }
        }
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}
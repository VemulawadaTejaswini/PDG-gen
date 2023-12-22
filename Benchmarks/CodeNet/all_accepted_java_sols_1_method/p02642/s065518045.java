import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        int cnt[]=new int[1000001];
        HashSet<Integer> hs=new HashSet<>();
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            cnt[arr[i]]+=1;
            hs.add(arr[i]);
        }
        if(cnt[1]==1)
        pw.println(1);
        else if(cnt[1]>1)
        pw.println(0);
        else
        {
            int ans=0;
            for(int i:hs)
            {
                if(cnt[i]==1)
                {
                    boolean got=true;
                    for(int j=2;j<=1000;j++)
                    {
                        if(i%j==0)
                        {
                            if(j!=i&&(cnt[j]>0||cnt[i/j]>0))
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
        }
        pw.flush();
        pw.close();
    }
}
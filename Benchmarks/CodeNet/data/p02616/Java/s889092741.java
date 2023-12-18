import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        final long m=(long)1e9+7;
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        str=br.readLine().split(" ");
        long arr[]=new long[n];
        //int p=0,ne=0;
        for(int i=0;i<n;i++)
        arr[i]=Long.parseLong(str[i]);
        ArrayList<Long> pos=new ArrayList<>();
        ArrayList<Long> neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            neg.add(arr[i]);
            else
            pos.add(arr[i]);
        }
        if(k==1)
        {
            long ans=Long.MIN_VALUE;
            for(int i=0;i<n;i++)
            ans=Math.max(ans,arr[i]);
            pw.println(ans);
        }
        else if(k==n)
        {
            long ans=1;
            for(int i=0;i<n;i++)
            ans=(ans*arr[i])%m;
            pw.println((ans+m)%m);
        }
        else if(pos.size()==0)
        {
            long ans=1;
            if(k%2==0)
            {
                //Collections.sort(pos,Collections.reverseOrder());
                Collections.sort(neg);
                for(int i=0;i<k;i++)
                ans=(ans*neg.get(i))%m;
            }
            else
            {
                Collections.sort(neg,Collections.reverseOrder());
                for(int i=0;i<k;i++)
                ans=(ans*neg.get(i))%m;
            }
            pw.println((ans+m)%m);
        }
        else
        {
            Collections.sort(pos,Collections.reverseOrder());
            Collections.sort(neg);
            long ans=1;
            if(k%2!=0)
            {
                int temp=k-1;
                int i=0,j=0;
                while(temp>0&&(i+1)<pos.size()-1&&(j+1)<neg.size())
                {
                    if(pos.get(i)*pos.get(i+1)>neg.get(j)*neg.get(j+1))
                    {
                        ans=(ans*((pos.get(i)*pos.get(i+1))%m))%m;
                        i+=2;
                    }
                    else
                    {
                        ans=(ans*(neg.get(j)*neg.get(j+1))%m)%m;
                        j+=2;
                    }
                    temp-=2;
                }
                while(temp>0&&i+1<pos.size()-1)
                {
                    ans=(ans*((pos.get(i)*pos.get(i+1))%m))%m;
                    i+=2;
                    temp-=2;
                }
                while(temp>0&&j+1<neg.size())
                {
                    ans=(ans*((neg.get(j)*neg.get(j+1))%m))%m;
                    j+=2;
                    temp-=2;
                }
                ans=(ans*pos.get(i))%m;
                pw.println(ans);
            }
            else
            {
                int temp=k;
                int i=0,j=0;
                while(temp>0&&(i+1)<pos.size()&&(j+1)<neg.size())
                {
                    if(pos.get(i)*pos.get(i+1)>neg.get(j)*neg.get(j+1))
                    {
                        ans=(ans*((pos.get(i)*pos.get(i+1))%m))%m;
                        i+=2;
                    }
                    else
                    {
                        ans=(ans*((neg.get(j)*neg.get(j+1))%m))%m;
                        j+=2;
                    }
                    temp-=2;
                }
                while(temp>0&&i+1<pos.size())
                {
                    ans=(ans*((pos.get(i)*pos.get(i+1))%m))%m;
                    i+=2;
                    temp-=2;
                }
                while(temp>0&&j+1<neg.size())
                {
                    ans=(ans*((neg.get(j)*neg.get(j+1))%m))%m;
                    j+=2;
                    temp-=2;
                }
                pw.println(ans);
            }
        }
        pw.flush();
        pw.close();
    }
}
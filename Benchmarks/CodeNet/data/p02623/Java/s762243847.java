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
        int m=Integer.parseInt(str[1]);
        long k=Long.parseLong(str[2]);
        str=br.readLine().split(" ");
        long arr1[]=new long[n];
        for(int i=0;i<n;i++)
        arr1[i]=Long.parseLong(str[i]);
        str=br.readLine().split(" ");
        long arr2[]=new long[m];
        for(int i=0;i<m;i++)
        arr2[i]=Long.parseLong(str[i]);
        long pref1[]=new long[n];
        long pref2[]=new long[m];
        pref1[0]=arr1[0];
        for(int i=1;i<n;i++)
        pref1[i]=pref1[i-1]+arr1[i];
        pref2[0]=arr2[0];
        for(int i=1;i<m;i++)
        pref2[i]=pref2[i-1]+arr2[i];
        long ans=pref1[n-1]+pref2[m-1];
        int i=n-1,j=m-1;
        while(i>=0&&j>=0&&ans>k)
        {
            if(pref1[i]>pref2[j])
            {
                ans-=arr1[i];
                i--;
            }
            else
            {
                ans-=arr2[j];
                j--;
            }
        }
        if(ans>k)
        {
            while(i>=0&&ans>k)
            {
                ans-=arr1[i];
                i--;
            }
            while(j>=0&&ans>k)
            {
                ans-=arr2[j];
                j--;
            }
        }
        pw.println(i+j+2);
        pw.flush();
        pw.close();
    }
}
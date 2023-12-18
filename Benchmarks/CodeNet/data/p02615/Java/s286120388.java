import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        long ans=0;
        int i,a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        for(i=1;i<n;i++)
        ans+=a[i];
        System.out.print(ans);
    }
}
import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        long sum=0;
        for(i=0;i<k;i++)
            sum+=a[i];
        System.out.print(sum);
    }
}

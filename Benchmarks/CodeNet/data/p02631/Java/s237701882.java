import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),a[]=new int[n],i;
        String s[]=bu.readLine().split(" ");
        a[0]=Integer.parseInt(s[0]);
        int xor=a[0];
        for(i=1;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            xor^=a[i];
        }
        for(i=0;i<n;i++)
        sb.append((a[i]^xor)+" ");
        System.out.print(sb);
    }
}

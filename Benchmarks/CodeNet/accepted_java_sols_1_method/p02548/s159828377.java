import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int ans=0,i,j,max=(int)Math.sqrt(n-1);
        for(i=1;i<=max;i++)
        for(j=i;j*i<n;j++) ++ans;
        ans*=2;
        ans-=max;
        System.out.print(ans);
    }
}

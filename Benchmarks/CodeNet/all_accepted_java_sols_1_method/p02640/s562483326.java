import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]);
        int i,j,f=0;
        for(i=0;i<=100;i++)
        for(j=0;j<=100;j++)
        if(i+j==x && 2*i+4*j==y) f=Math.max(f,1);
        if(f==1) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}

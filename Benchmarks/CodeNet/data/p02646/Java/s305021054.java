import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),v=Integer.parseInt(s[1]);
        s=bu.readLine().split(" ");
        int b=Integer.parseInt(s[0]),w=Integer.parseInt(s[1]);
        if(a>b) a=a^b^(b=a);
        int t=Integer.parseInt(bu.readLine());
        double relt=1.0*(b-a)/(v-w);
        if(relt>=0 && relt<=t) sb.append("YES");
        else sb.append("NO");
        System.out.print(sb);
    }
}

import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char s[]=bu.readLine().toCharArray();
        int i,ans=0;
        for(i=0;i<s.length;i++)
        ans+=s[i]-'0';
        if(ans%9==0) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}

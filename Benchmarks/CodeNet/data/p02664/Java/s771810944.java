import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char s[]=bu.readLine().toCharArray();
        for(int i=0;i<s.length;i++)
        if(s[i]=='?') sb.append('D');
        else sb.append(s[i]);
        System.out.print(sb);
    }
}

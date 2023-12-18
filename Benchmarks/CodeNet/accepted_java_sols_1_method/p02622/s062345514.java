import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        char s[] = str1.toCharArray();
        char t[] = str2.toCharArray();
        int ans = 0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]!=t[i])
                ans++;
        }
        System.out.println(ans);
        
        
    }
}
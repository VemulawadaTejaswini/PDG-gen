import java.util.*;
import java.io.*;
public class Main
{
    static BufferedReader br;
    static BufferedWriter bw;
    static void solve()throws Exception
    {
        String s = br.readLine();
        String d = br.readLine();
        if((s.length()+1) != d.length())
        bw.write("No");
        else
        {
            boolean flag = true;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=d.charAt(i))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            bw.write("Yes");
            else
            bw.write("No");
        }
    }
    public static void main(String []args)throws Exception
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        solve();
        br.close();
        bw.close();
    }
}
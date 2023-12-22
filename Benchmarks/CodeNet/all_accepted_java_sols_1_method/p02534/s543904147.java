import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int k=Integer.parseInt(bu.readLine());
        while(k!=0)
        {
            sb.append("ACL");
            k--;
        }
        System.out.print(sb);
    }
}

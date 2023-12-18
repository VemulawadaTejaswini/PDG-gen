import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=bu.readLine();
        int l=s.length()-1;
        sb.append(s);
        if(s.charAt(l)=='s') sb.append("es");
        else sb.append("s");
        System.out.print(sb);
    }
}

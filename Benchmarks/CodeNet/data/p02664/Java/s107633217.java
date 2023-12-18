import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=bu.readLine();
        String ans="";
        for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='?') ans+="D";
        else ans+=s.charAt(i);
        System.out.print(ans);
    }
}

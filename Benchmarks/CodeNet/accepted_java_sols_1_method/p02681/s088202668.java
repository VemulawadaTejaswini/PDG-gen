import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s=bu.readLine();
        String t=bu.readLine();
        int i,fl=0;
        for(i=0;i<s.length();i++)
        if(s.charAt(i)!=t.charAt(i)) {fl=1; break;}
        if(fl==1 || t.length()-s.length()!=1) System.out.print("No");
        else System.out.print("Yes");
    }
}

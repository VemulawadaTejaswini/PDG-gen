import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(bu.readLine());
        String s=bu.readLine();
        if(k<s.length()) s=s.substring(0,k)+"...";
        System.out.print(s);
    }
}

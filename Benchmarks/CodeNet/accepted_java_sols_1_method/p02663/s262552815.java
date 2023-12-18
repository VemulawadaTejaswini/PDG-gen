import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int h1=Integer.parseInt(s[0]),m1=Integer.parseInt(s[1]),h2=Integer.parseInt(s[2]),m2=Integer.parseInt(s[3]),k=Integer.parseInt(s[4]);
        int min1=h1*60+m1,min2=h2*60+m2;
        int diff=min2-k;
        System.out.print(Math.max(0,diff-min1));
    }
}

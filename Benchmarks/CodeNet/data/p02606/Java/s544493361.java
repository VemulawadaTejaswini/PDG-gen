import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int l=Integer.parseInt(s[0]),r=Integer.parseInt(s[1]),d=Integer.parseInt(s[2]),i,c=0;
        for(i=l;i<=r;i++)
        if(i%d==0) c++;
        System.out.print(c);
    }
}
import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" "); int i,pos=0;
        for(i=0;i<5;i++)
        if(Integer.parseInt(s[i])==0) {pos=i+1; break;}
        System.out.print(pos);
    }
}

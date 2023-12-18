import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        int min=Integer.MAX_VALUE;
        ArrayList<String> l=new ArrayList<>();
        ArrayList<String> d=new ArrayList<>();
        ArrayList<String> r=new ArrayList<>();
        ArrayList<String> u=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str[]=br.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
            if(str[2].equals("L"))
            l.add(x+" "+y);
            else if(str[2].equals("D"))
            d.add(x+" "+y);
            else if(str[2].equals("R"))
            r.add(x+" "+y);
            else //if(str[2].equals("D"))
            u.add(x+" "+y);
        }
        for(String s1:u)
        {
            for(String s2:d)
            {
                int x1=Integer.parseInt(s1.split(" ")[0]);
                int y1=Integer.parseInt(s1.split(" ")[1]);
                int x2=Integer.parseInt(s2.split(" ")[0]);
                int y2=Integer.parseInt(s2.split(" ")[1]);
                if(x1==x2&&y1<=y2)
                {
                    if((int)Math.abs(y1-y2)%2!=0)
                    min=Math.min(min,((int)Math.abs(y1-y2)/2)*10+5);
                    else
                    min=Math.min(min,((int)Math.abs(y1-y2)/2)*10);
                }
            }
        }
        //pw.println(min);
        for(String s1:l)
        {
            for(String s2:r)
            {
                int x1=Integer.parseInt(s1.split(" ")[0]);
                int y1=Integer.parseInt(s1.split(" ")[1]);
                int x2=Integer.parseInt(s2.split(" ")[0]);
                int y2=Integer.parseInt(s2.split(" ")[1]);
                if(y1==y2&&x1>=x2)
                {
                    if((int)Math.abs(x1-x2)%2!=0)
                    min=Math.min(min,((int)Math.abs(x1-x2)/2)*10+5);
                    else
                    min=Math.min(min,((int)Math.abs(x1-x2)/2)*10);
                }
            }
        }
        //pw.println(min);
        for(String s1:l)
        {
            for(String s2:d)
            {
                int x1=Integer.parseInt(s1.split(" ")[0]);
                int y1=Integer.parseInt(s1.split(" ")[1]);
                int x2=Integer.parseInt(s2.split(" ")[0]);
                int y2=Integer.parseInt(s2.split(" ")[1]);
                if(x1>=x2&&y1<=y2&&(x1-x2)==(y2-y1))
                min=Math.min(min,(int)Math.abs(x1-x2)*10);
            }
        }
        //pw.println(min);
        if(min==Integer.MAX_VALUE)
        pw.println("SAFE");
        else
        pw.println(min);
        pw.flush();
        pw.close();
    }
}
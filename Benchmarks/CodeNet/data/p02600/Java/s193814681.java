import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //int t=Integer.parseInt(br.readLine());
        //while(t-->0)
        //{
            int n=Integer.parseInt(br.readLine());
            if(n>=400&&n<600)
            pw.println(8);
            else if(n>=600&&n<800)
            pw.println(7);
            else if(n>=800&&n<1000)
            pw.println(6);
            else if(n>=1000&&n<1200)
            pw.println(5);
            else if(n>=1200&&n<1400)
            pw.println(4);
            else if(n>=1400&&n<1600)
            pw.println(3);
            else if(n>=1600&&n<1800)
            pw.println(2);
            else
            pw.println(1);
        //}
        pw.flush();
        pw.close();
    }
}
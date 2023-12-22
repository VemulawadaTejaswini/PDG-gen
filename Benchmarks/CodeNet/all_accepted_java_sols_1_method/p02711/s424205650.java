import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //String str[]=br.readLine().split(" ");
        //int n=Integer.parseInt(br.readLine());
        //int n=Integer.parseInt(str[0]);
        //int n=Integer.parseInt(str[1]);
        String s=br.readLine();
        if(s.indexOf('7')!=-1)
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
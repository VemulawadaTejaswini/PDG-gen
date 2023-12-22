import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);
        int d=Integer.parseInt(str[3]);
        int tak=(int)Math.ceil((double)c/b);
        int aok=(int)Math.ceil((double)a/d);
        if(tak<=aok)
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        if(s.charAt(2)==s.charAt(3)&&s.charAt(5)==s.charAt(4))
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
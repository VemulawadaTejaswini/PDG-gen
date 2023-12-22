import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        char carr[]=br.readLine().toCharArray();
        if(carr[carr.length-1]=='2'||carr[carr.length-1]=='4'||carr[carr.length-1]=='5'||carr[carr.length-1]=='7'||carr[carr.length-1]=='9')
        pw.println("hon");
        else if(carr[carr.length-1]=='3')
        pw.println("bon");
        else
        pw.println("pon");
        pw.flush();
        pw.close();
    }
}
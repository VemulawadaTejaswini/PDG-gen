import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String ars[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        char arr[]=br.readLine().toCharArray();
        if(arr[0]>='A'&&arr[0]<='Z')
        pw.println("A");
        else
        pw.println("a");
        pw.flush();
        pw.close();
    }
}
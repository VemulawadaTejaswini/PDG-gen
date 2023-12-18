import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        char carr1[]=br.readLine().toCharArray();
        char carr2[]=br.readLine().toCharArray();
        int cntr=0;
        for(int i=0;i<carr1.length;i++)
        {
            if(carr1[i]!=carr2[i])
            cntr++;
        }
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}
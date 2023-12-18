import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int x=Integer.parseInt(str[0]);
        int y=Integer.parseInt(str[1]);
        boolean b=false;;
        for(int i=0;i<=x;i++)
        {
            if(i*2+(x-i)*4==y)
            {
                b=true;
                break;
            }
        }
        if(b)
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
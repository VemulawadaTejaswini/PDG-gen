import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String arggs[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //int n=Integer.parseInt(br.readLine());
        //int arr[]=new int[n];
        String str[]=br.readLine().split(" ");
        //for(int i=0;i<n;i++)
        //arr[i]=Integer.parseInt(str[i]);
        int l=Integer.parseInt(str[0]);
        int r=Integer.parseInt(str[1]);
        int d=Integer.parseInt(str[2]);
        int cntr=0;
        for(int i=l;i<=r;i++)
        if(i%d==0)
        cntr++;
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}
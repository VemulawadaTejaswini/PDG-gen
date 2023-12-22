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
        String str[]=br.readLine().split(" ");
        //int n=Integer.parseInt(str[0]);
        //int k=Integer.parseInt(str[1]);
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(str[i]);
        //str=br.readLine().split(" ");
        long money=1000;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]>arr[i])
            {
                long numofstock=money/arr[i];
                money=money%arr[i];
                money+=numofstock*arr[i+1];
            }
        }
        pw.println(money);
        pw.flush();
        pw.close();
    }
}
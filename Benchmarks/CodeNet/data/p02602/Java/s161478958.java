import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        BigInteger arr[]=new BigInteger[n];
        str=br.readLine().split(" ");
        arr[0]=new BigInteger(str[0]);
        for(int i=1;i<n;i++)
        arr[i]=new BigInteger(str[i]).multiply(arr[i-1]);
        BigInteger last=arr[k-1];
        for(int i=k;i<n;i++)
        {
            BigInteger temp=arr[i].divide(arr[i-k]);
            if(temp.compareTo(last)>0)
            pw.println("Yes");
            else
            pw.println("No");
            last=temp;
        }
        pw.flush();
        pw.close();
    }
}
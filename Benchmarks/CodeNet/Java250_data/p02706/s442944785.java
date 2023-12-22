import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    String line[]=in.readLine().trim().split(" ");
    int n=Integer.parseInt(line[0]);
    int m=Integer.parseInt(line[1]);
    String arr[]=in.readLine().trim().split(" ");
    int i;
    int a[]=new int[m];
    int sum[]=new int[m];
    for(i=0;i<m;i++)
    {
        a[i]=Integer.parseInt(arr[i]);
    }
    sum[0]=a[0];
    for(i=1;i<m;i++)
    {
        sum[i]=sum[i-1]+a[i];
    }
    int ans=n-sum[m-1];
    if(ans>=0)
    System.out.println(ans);
    else
    System.out.println("-1");
  }
}
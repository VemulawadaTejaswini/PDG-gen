import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    long ans=0;
    for( int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      ans+=(long)a[i];
    }
    Arrays.sort(a);
    ans-=a[0];
    
    System.out.println(ans);
  }
}

import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int x=0;
    for(int i=0;i<n;i++)
    {
        int val=sc.nextInt();
        a[i]=val;
        x^=a[i];
    }
    for(int i=0;i<n;i++)
    {
        int v=x^a[i];
        System.out.print(v+" ");
    }
  }
}
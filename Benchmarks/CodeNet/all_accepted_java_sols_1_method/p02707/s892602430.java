import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int x=0;x<n-1;x++)
    {
      int a=sc.nextInt();
      ar[a-1]++;
    }
    for(int x=0;x<n;x++)
    {
      System.out.println(ar[x]);
    }
  }
}
import java.util.*;
import java.util.Arrays;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
      ar[i]=sc.nextInt();
    }
    Arrays.sort(ar);
    int sum=0;
    for(int i=0;i<p;i++)
    {
      sum+=ar[i];
    }
    System.out.println(sum);
  }
}
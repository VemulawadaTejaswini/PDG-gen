import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,i,h=0;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    int a[]= new int[n];
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(i=0;i<n-1;i++)
    {
      if(a[i]>a[i+1])
      {
        h=h+(a[i]-a[i+1]);
        a[i+1]+=(a[i]-a[i+1]);
      }
    }
    System.out.println(h);
  }
}
   
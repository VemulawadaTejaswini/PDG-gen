import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	  
    int n=sc.nextInt();
    int m=sc.nextInt();
    int sum=0;
    int a[]=new int[m];
    for(int i=0;i<m;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++)
    {
      sum=sum+a[i];
    }
    if(sum > n)
    {
      System.out.println("-1");
    }
    else
    {
      System.out.println(n-sum);
    }
  }
}
      
    
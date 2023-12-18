import java.util.*;
public class Main
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  int p = 200003;
    int n = sc.nextInt();
    int a[]=new int[n];
    long c=0;
    for(int i=0;i<n;i++) a[i]=sc.nextInt();
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
    	  long a1 = (long)(((long)(a[i]%p) * (long)(a[j]%p))%p);
    	  c+=a1;
      }
    }
    System.out.println(c);
  }  
}
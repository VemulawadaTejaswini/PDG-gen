import java.util.*;
public class Main
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double a[]=new double[n];
    int c=0;
    for(int i=0;i<n;i++) a[i]=sc.nextDouble();
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
    	  long a1 = (long)(a[i]*a[j]);
    	  double d = (double)a1;
    	  double d1 = a[i]*a[j];
        if(d==d1) c++;
      }
    }
    System.out.println(c);
  }  
}
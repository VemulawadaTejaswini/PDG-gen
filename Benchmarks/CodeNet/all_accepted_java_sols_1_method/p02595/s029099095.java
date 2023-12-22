import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long d=sc.nextLong();
    int count=0;
    for(int i=0;i<n;i++)
    {
    	long x=sc.nextLong();
    	long y=sc.nextLong();
    	long z=x*x+y*y;
    	double p=Math.sqrt(z);
    	if(p<=d)
    	{
    		count++;
    	}
    	
    }
    System.out.println(count);
  }

}
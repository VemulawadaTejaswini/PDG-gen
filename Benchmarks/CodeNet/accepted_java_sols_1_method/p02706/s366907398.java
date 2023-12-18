import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int m=Sc.nextInt();
    int sum=0;
    for(int i=0;i<m;i++)
      sum=sum+Sc.nextInt();
   	if(n-sum>=0)
    	System.out.println(n-sum);
    else
    	System.out.println("-1");
  }
}

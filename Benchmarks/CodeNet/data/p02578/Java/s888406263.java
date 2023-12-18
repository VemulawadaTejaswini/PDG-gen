import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
  
  int n=sc.nextInt();
  long t=0;
  int max=0;
  for(int i=0;i<n;i++)
  {
      int x=sc.nextInt();
      max=Math.max(max, x);
      t+=max-x;
  }
      System.out.println(t);
    
  }
}
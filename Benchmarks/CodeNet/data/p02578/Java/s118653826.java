import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   Stack<Integer> s=new Stack<>();
  int n=sc.nextInt();
  int a[]=new int[n];
 int t=0;
  for(int i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
          
  }
  s.push(a[n-1]);
  for(int i=n-2;i>=0;i--)
  {
      if(s.isEmpty())s.push(a[i]);
      else if(s.peek()<=a[i])s.push(a[i]);
      else
      {
          int c=s.pop();
          while(!s.isEmpty())
          {
              t+=c-s.pop();
          }
          s.push(a[i]);
      }
      
  }
  if(!s.isEmpty())
  {
      int c=s.pop();
       while(!s.isEmpty())
          {
              t+=c-s.pop();
          }
  }
      System.out.println(t);
    
  }
}
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   long sum=0;
   for(int i=1;i<=n;i++)
   {
       sum=sum+(i*div(i));
   }
   System.out.println(sum);
  }
  
  static int div(int a)
  {
      int count=0;
      for(int i=1;i<=a/2;i++)
      {
          if(a%i==0)
             count++;
      }
       
      return count+1;
  }
}
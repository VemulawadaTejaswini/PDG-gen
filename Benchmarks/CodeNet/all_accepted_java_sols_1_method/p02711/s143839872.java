import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=false;
    while(n!=0)
    {
      int d=n%10;
      if(d==7)
      {flag=true;
        break;}
      n/=10;
    }
   if(flag)
     System.out.println("Yes");
    else
     System.out.println("No"); 
  }
}
   
    

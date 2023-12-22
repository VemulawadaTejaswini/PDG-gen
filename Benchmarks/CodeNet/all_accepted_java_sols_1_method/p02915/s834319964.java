import java.util.*;
import java.io.*;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a==1)
    {
      System.out.print(1);
    }
    else if(a==2)
    {
      System.out.print(8);
    }
    else{
      int c=0,m=0,n=0;
      m=a*(a-1);
      m=m/2;
      n=a*(a-1)*(a-2);
      n=n/6;
      m=m*8;
      n=n*6;
      c=m+n;
      c=c-(a*(a-2));
      System.out.print(c);
    }
    

  }
}
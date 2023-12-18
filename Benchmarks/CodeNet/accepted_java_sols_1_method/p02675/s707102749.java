import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    n=n%10;
    if(n==0|| n==1 || n==6 || n==8)
    {
      System.out.println("pon");
    }
    else if(n==3)
    {
      System.out.println("bon");
    }
    else
    {
      System.out.println("hon");
    }
  }
}
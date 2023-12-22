import java.io.*;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x==0)
      System.out.println("1");
    else if(x==1)
      System.out.println("0");
    else
      System.out.println("-1");
  }
}
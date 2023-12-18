import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double num=sc.nextDouble();
    if(num%9.0==0.0)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}
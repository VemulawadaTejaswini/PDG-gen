import java.io.*;
import java.util.*;
class Main
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(s.indexOf('A')==-1 || s.indexOf('B')==-1)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}
import java.io.*;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    String str = sc.next();
    int len=str.length();
    if(str.charAt(len-1)=='s')
      System.out.print(str+"es");
    else
      System.out.print(str+"s");
  }
}
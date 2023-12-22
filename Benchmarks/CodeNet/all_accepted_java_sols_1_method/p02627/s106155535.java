import java.util.*;
public class Main
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    char ch=a.charAt(0);
    if((int)ch>=65&&(int)ch<=90)
      System.out.println("A");
    else
      System.out.println("a");
  }
}
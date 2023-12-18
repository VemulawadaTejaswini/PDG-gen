import java.util.*;
import java.lang.*;
class TestA
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char ch=s.charAt(0);
    if(Character.isUpperCase(ch))
      System.out.println("A");
    else
      System.out.println("a");
  }
}
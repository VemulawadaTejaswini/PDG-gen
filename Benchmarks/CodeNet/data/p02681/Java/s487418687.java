import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    if(a.length()==b.length()-1&&b.indexOf(a)!=-1)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String x=sc.next();
    String y=sc.next();
    x+=y.charAt(y.length()-1);
    if(x.equals(y))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}

import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int max=Math.max(a+b,a*b);
    max=Math.max(max,a-b);
    System.out.println(max);
  }
}
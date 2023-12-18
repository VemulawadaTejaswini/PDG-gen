import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String str = sc.next();
    if(str.length() <= A)
    {
      System.out.println(str);
    }
     else
     {
       String s = str.substring(0,A);
       s = s+"...";
       System.out.println(s);
     }
  }
}

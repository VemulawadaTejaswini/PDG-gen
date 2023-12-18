import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in); 
    int n = Integer.parseInt(in.nextLine());
    String s = in.nextLine();
    if(s.length() <= n)
    {
      System.out.println(s);
    }
    else
    {
      System.out.println(s.substring(0, n) + "...");
    }
  }
}
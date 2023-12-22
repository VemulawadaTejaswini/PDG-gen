import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in); 
    String s = in.nextLine();
    if(s.substring(s.length() - 1, s.length()).equals("3"))
    {
      System.out.println("bon");
    }
    else if(s.substring(s.length() - 1, s.length()).equals("0") || s.substring(s.length() - 1, s.length()).equals("1") || s.substring(s.length() - 1, s.length()).equals("6") || s.substring(s.length() - 1, s.length()).equals("8"))
    {
      System.out.println("pon");
    }
    else
    {
      System.out.println("hon");
    }
  }
}
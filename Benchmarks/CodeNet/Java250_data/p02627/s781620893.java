import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    char c=in.next().charAt(0);
    char up=Character.toUpperCase(c);
    char down=Character.toLowerCase(c);
    if(c==up)
    {
      System.out.println("A");
    }
    else
    {
      System.out.println("a");
    }
  }
}
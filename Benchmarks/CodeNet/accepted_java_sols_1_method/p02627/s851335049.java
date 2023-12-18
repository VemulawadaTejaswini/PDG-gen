import java.util.*;

class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    char ch = s.next().charAt(0);
    if(ch >= 'A' && ch <= 'Z') System.out.println('A');
    else System.out.println('a');
  }
}
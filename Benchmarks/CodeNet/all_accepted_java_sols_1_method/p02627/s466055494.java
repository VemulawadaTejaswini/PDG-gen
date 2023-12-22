import java.util.Scanner;
import java.util.regex.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    if(Pattern.matches("[A-Z]",str))
      System.out.println('A');
      else
        System.out.println('a');
  }
}

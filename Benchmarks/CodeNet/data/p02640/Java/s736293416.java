import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int d = Y - (2 * X);
    
    if(d >= 0 && d % 2 == 0 && (d / 2) <= X)
    {
      System.out.println("Yes");
    }
      else
      {
      System.out.println("No");
      }
  }
}

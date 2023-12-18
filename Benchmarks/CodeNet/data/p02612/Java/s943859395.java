import java.util.*;
 
public class easy
{
  public static void main(String[]args)
  {
 	Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    n = n % 1000;
    int answer = 1000 - n;
    System.out.print(answer);
  }
}
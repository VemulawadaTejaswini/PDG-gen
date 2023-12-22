import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int x1 = n/500;
    int r = n%500;
    int x2 = r/5;
    System.out.println(1000*x1+5*x2);
  }
}
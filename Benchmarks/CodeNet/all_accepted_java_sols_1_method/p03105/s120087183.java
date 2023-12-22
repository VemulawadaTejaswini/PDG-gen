import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    if(b/a>=c)
      System.out.println(c);
    else
      System.out.println(b/a);
  }
}
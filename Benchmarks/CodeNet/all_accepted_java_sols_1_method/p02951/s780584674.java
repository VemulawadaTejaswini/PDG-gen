import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int total = c - (a - b);
    
    if (total >= 0) {
      System.out.println(total);
    } else {
      System.out.println(0);
    }
  }
}
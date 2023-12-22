import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    
    int sum = 0;
    
    if (k <= a) {
      System.out.println(1 * k);
    } else if ((a < k) && (k <= a+ b)) {
      System.out.println(1 * (k - b));
    } else if ((a+b < k) && (k <= a + b + c)) {
      System.out.println(1 * a + -1 * (k -b -a));
    } else {
      System.out.println(1 * a + -1 * (k - a - b));
    }
  }
}
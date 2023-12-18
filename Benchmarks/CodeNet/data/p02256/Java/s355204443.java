
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(calcGreatestCommonDivisor(a,b));
  }
  
  static int calcGreatestCommonDivisor(int x, int y) {
    // x≥y のとき gcd(x,y) と gcd(y,xをyで割った余り) は等しい
    if (x < y) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    while (y > 0) {
      int r = x % y;
      x = y;
      y = r;
    }
    return x;
  }
}


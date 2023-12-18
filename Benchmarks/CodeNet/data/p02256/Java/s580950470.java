import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(gcd(a, b));
  }
  
  public static int gcd(int x, int y) {
    if      (y == 0) return x;
    else if (x < y)  return gcd(y, x);
    else if (x > y)  return gcd(y, x%y);
    else             return x;
  }
}
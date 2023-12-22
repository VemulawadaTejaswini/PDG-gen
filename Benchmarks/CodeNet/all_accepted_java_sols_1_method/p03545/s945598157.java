import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String N = sc.next();
    int A = N.charAt(0) - '0';
    int B = N.charAt(1) - '0';
    int C = N.charAt(2) - '0';
    int D = N.charAt(3) - '0';
    int n = 7;
    
    if (A + B + C + D == n) {
      System.out.println(A + "+" + B + "+" + C + "+" + D + "=7");
    } else if (A + B + C - D == n) {
      System.out.println(A + "+" + B + "+" + C + "-" + D + "=7");
    } else if (A + B - C + D == n) {
      System.out.println(A + "+" + B + "-" + C + "+" + D + "=7");
    } else if (A + B - C - D == n) {
      System.out.println(A + "+" + B + "-" + C + "-" + D + "=7");
    } else if (A - B + C + D == n) {
      System.out.println(A + "-" + B + "+" + C + "+" + D + "=7");
    } else if (A - B + C - D == n) {
      System.out.println(A + "-" + B + "+" + C + "-" + D + "=7");
    } else if (A - B - C + D == n) {
      System.out.println(A + "-" + B + "-" + C + "+" + D + "=7");
    } else if (A - B - C - D == n) {
      System.out.println(A + "-" + B + "-" + C + "-" + D + "=7");
    }
  }
}
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int x = 0;
    int y = 0;

    while(A > 0) {
      A = A - D;
      x++;
    }
    while(C > 0) {
      C = C - B;
      y++;
    }
    if (x >= y) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
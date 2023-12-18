import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    int hole = 1;
    if (B == 1) {
      System.out.println(0);
      return;
    }
    hole = A;
    ans = 1;
    while (hole < B) {
      hole += A - 1;
      ans++;
    }
    System.out.println(ans);
  }
}

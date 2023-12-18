import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    if (N % 2 == 1) {
      System.out.println("No");
      return;
    }
    for (int i = 0; i < N / 2; i++) {
      if (S.charAt(i) != S.charAt(i + N/2)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}

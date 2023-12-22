import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (a % 2 == 0) {
        if (!(a %3 == 0 || a %5 == 0)) {
          System.out.println("DENIED");
          return;
        }
      }
    }
    System.out.println("APPROVED");
  }
}

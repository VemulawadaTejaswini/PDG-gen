import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= N; i++) {
      int pi = sc.nextInt();
      if (pi != i) count++;
    }
    if (count == 0 || count == 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

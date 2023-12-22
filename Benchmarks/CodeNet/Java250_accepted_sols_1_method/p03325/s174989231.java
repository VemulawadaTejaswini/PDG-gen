import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    for (int i = 0; i < N; i++) {
      long a = sc.nextLong();
      while (a > 0) {
        if (a % 2 != 0) {
          break;
        }
        count++;
        a /= 2;
      }
    }
    System.out.println(count);
  }
}

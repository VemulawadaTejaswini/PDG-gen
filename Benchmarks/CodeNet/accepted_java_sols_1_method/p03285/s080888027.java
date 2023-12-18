import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        int tmp = 4*i + 7*j;
        if (N == tmp) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
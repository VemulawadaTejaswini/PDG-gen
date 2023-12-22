import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] p = new int[N];
    for (int i = 0; i < N; i++) {
      p[i] = Integer.parseInt(sc.next());
    }

    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (p[i] != i+1) {
        cnt++;
      }
    }

    System.out.println(cnt <= 2 ? "YES" : "NO");
  }
}
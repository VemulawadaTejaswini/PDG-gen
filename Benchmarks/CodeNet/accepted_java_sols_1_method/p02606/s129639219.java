import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int L, R, d, cnt;
    L = sc.nextInt();
    R = sc.nextInt();
    d = sc.nextInt();
    cnt = 0;

    for (int i = L; i <= R; i++) {
      if (i % d == 0)
        cnt++;
    }
    System.out.println(cnt);
  }
}
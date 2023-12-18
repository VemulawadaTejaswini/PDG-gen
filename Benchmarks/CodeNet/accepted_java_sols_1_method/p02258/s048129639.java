import java.util.Scanner;

// https://onlinejudge.u-aizu.ac.jp/courses/lesson/1/ALDS1/1/ALDS1_1_D
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int minv = sc.nextInt();
    int maxv = Integer.MIN_VALUE;

    for (int i = 1; i < n; i++) {
      int R = sc.nextInt();
      maxv = Integer.max(maxv, R - minv);
      minv = Integer.min(minv, R);
    }
    System.out.println(maxv);
  }
}


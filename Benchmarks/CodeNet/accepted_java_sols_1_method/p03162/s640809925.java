import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] h = new int[N][3];
    h[0][0] = sc.nextInt();
    h[0][1] = sc.nextInt();
    h[0][2] = sc.nextInt();
    for (int i = 1; i < N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      h[i][0] = a+Math.max(h[i-1][1], h[i-1][2]);
      h[i][1] = b+Math.max(h[i-1][2], h[i-1][0]);
      h[i][2] = c+Math.max(h[i-1][0], h[i-1][1]);
    }
    System.out.println(Math.max(Math.max(h[N-1][0],h[N-1][1]),h[N-1][2]));
  }
}
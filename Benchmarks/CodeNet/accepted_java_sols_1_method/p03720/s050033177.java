import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] num = new int[51];
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      num[a]++;
      num[b]++;
    }
    for (int i = 1; i <= N; i++) {
      System.out.println(num[i]);
    }
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int[] num = new int[D + 1];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j * A[i] + 1 <= D; j++) {
        num[j * A[i] + 1]++;
      }
    }
    int count = X;
    for (int i = 1; i <= D; i++) {
      count += num[i];
    }
    System.out.println(count);
  }
}
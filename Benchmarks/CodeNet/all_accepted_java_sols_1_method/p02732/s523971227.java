import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    HashMap<Integer, Long> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      map.put(A[i], map.getOrDefault(A[i], 0L) + 1);
    }
    long sum = 0;
    for (Long val : map.values()) {
      sum += val * (val - 1) / 2;
    }
    for (int i = 0; i < N; i++) {
      long sum1 = sum;
      long val = map.get(A[i]);
      sum1 -= val * (val - 1) / 2;
      if (val > 2) {
        sum1 += (val - 1) * (val - 2) / 2;
      }
      System.out.println(sum1);
    }
  }
}

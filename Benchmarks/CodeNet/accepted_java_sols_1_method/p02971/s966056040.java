import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    HashMap<Integer, Integer> map = new HashMap<>();
    int max1 = 0, max2 = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      Integer cnt = map.getOrDefault(A[i], 0);
      map.put(A[i], cnt + 1);
      if (A[i] >= max1) {
        max2 = max1;
        max1 = A[i];
      } else if (A[i] >= max2) {
        max2 = A[i];
      }
    }
    for (int i = 0; i < N; i++) {
      int ans;
      if (A[i] == max1) {
        if (map.get(max1) > 1) {
          ans = max1;
        } else {
          ans = max2;
        }
      } else {
        ans = max1;
      }
      System.out.println(ans);
    }
  }
}
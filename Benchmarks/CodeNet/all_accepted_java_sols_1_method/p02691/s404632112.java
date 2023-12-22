import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = scan.nextInt();
    }

    Map<Integer, Integer> countMap = new HashMap<>();

    long total = 0;
    for (int i = 0; i < n; i++) {
      int cur = A[i];
      int diff = i - cur;

      if (countMap.containsKey(diff)) {
        total += countMap.get(diff);
      }

      int sum = i + cur;
      if (!countMap.containsKey(sum)) {
        countMap.put(sum, 0);
      }
      countMap.put(sum, countMap.get(sum) + 1);
    }

    System.out.println(total);
  }
}
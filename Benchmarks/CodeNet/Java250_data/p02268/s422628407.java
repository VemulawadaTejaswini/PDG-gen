
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      solve(sc);
    }
  }

  static void solve(Scanner sc) {
    int n = sc.nextInt();
    int[] S = new int[n];
    for (int i = 0; i < n; i++) {
      S[i] = sc.nextInt();
    }

    int q = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < q; i++) {
      if (binarySearch(S, sc.nextInt()) != -1)
        sum++;
    }

    System.out.println(sum);
  }

  static int binarySearch(int[] arr, int target) {
    // 探索範囲
    int begin = 0;
    int end = arr.length;

    while (begin < end) {
      int center = (begin + end) / 2;
      if (arr[center] == target) {
        return center;
      } else {
        if (arr[center] > target) {
          end = center;// 前を探す
        } else {
          begin = center + 1;// 後ろを探す
        }
      }
    }
    return -1;
  }
}


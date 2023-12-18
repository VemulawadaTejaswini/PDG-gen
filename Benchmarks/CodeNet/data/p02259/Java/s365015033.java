
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int cnt = bubbleSort(arr);
    trace(arr);
    System.out.println(cnt);
  }

  static int bubbleSort(int[] arr) {
    int cnt = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int tmp = 0;
      for (int j = arr.length - 1; j >= i + 1; j--) {
        if (arr[j] < arr[j - 1]) {
          tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
          cnt++;
        }
      }
    }
    return cnt;
  }

  static void trace(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int num : arr) {
      sb.append(num).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}


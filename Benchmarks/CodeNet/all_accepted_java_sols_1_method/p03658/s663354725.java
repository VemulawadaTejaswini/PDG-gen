import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] arr = new Integer[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr, Comparator.reverseOrder());
    int ans = 0;
    for (int i = 0; i < K; i++) {
      ans += arr[i];
    }

    System.out.println(ans);
  }
}
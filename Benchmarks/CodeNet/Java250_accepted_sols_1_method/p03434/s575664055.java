
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer[] arr = new Integer[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    // 2 人とも自分の得点を最大化するように最適な戦略
    // ソートして、うしろからカードを取る
    Arrays.sort(arr, Comparator.reverseOrder());
    int alice = 0;
    int bob = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        alice += arr[i];
      } else {
        bob += arr[i];
      }
    }

    System.out.println(alice - bob);
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      solve(sc);
    }
  }

  static void solve(Scanner sc) {
    int n = sc.nextInt();
    int[] S = new int[n + 1];// 番兵分の要素を追加で
    for (int i = 0; i < n; i++) {
      S[i] = sc.nextInt();
    }

    int q = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < q; i++) {
      if(linearSearch(S, n, sc.nextInt())) sum++;
    }

    System.out.println(sum);
  }

  static boolean linearSearch(int[] arr, int target, int key) {
    // 「番兵にたどり着くまで」と考えて、while だけでループと比較を表現できる
    int i = 0;
    arr[target] = key;
    while (arr[i] != key) i++;
    return i != target;
	}
}


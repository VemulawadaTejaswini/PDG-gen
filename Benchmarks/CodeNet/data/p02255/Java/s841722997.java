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

    trace(arr);
    insertionSort(arr);
  }

  static void insertionSort(int[] arr) {
		// 最初の要素はソート済みとする。ここを基準にしてそれ以降の要素を入れ替える
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];// 入れ替える要素を避けておいて
			int k = i;

			// 挿入する場所を探しつつ
			while (k > 0 && arr[k - 1] > tmp) {
				arr[k] = arr[k - 1];// 要素を大きいほうに詰める
				k--;
			}
      arr[k] = tmp;
      trace(arr);
    }
  }

  static void trace(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int num : arr) {
      sb.append(num).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}

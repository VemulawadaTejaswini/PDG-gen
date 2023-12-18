import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] arg) {
    // 変数の初期化
    Scanner sc = new Scanner(System.in);
    sc.nextLine(); // 入力値の1行目は不要なので読み捨てる
    int swapCount = 0;
    int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    sc.close();

    // 配列のソート
    for (int i = 0; i < numbers.length; i++) {
      int mini = i; // 最小値をとる要素の番号
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[mini]) {
          mini = j;
        }
      }
      // 配列のi番目の要素とmini番目の要素を置き換える
      // i番目の要素が最小のときは置き換えを行わない
      if (mini != i) {
        int tmp = numbers[i];
        numbers[i] = numbers[mini];
        numbers[mini] = tmp;
        swapCount++;
      }
    }
    // 配列と置換回数の出力
    System.out.println(
        Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.joining(" ")));
    System.out.println(swapCount);
  }
}


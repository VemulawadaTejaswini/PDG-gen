import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    // 入力値の1行目は不要なので読み捨てる
    sc.nextLine();
    // 入力値の2行目をint型の配列に格納
    int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    sc.close();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = numbers.length - 1; j >= i + 1; j--) {
        if (numbers[j] < numbers[j - 1]) {
          int tmp = numbers[j];
          numbers[j] = numbers[j - 1];
          numbers[j - 1] = tmp;
          count++;
        }
      }
    }

    System.out.println(
        Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.joining(" ")));
    System.out.println(count);
  }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);

    // 先頭行は不要なので読み捨てる
    sc.nextLine();

    // 2行目の内容をint型の配列に格納
    int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    sc.close();

    // 配列をソート
    for (int i = 1; i < numbers.length; i++) {
      int key = numbers[i];
      int j = i - 1;
      System.out.println(String.join(" ",
          Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.joining(" "))));
      while (j >= 0 && numbers[j] > key) {

        numbers[j + 1] = numbers[j];
        j--;
      }
      numbers[j + 1] = key;
    }
    System.out.println(String.join(" ",
        Arrays.stream(numbers).boxed().map(String::valueOf).collect(Collectors.joining(" "))));
  }
}

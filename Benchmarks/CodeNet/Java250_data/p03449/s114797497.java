import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      list1.add(scanner.nextInt());
    }

    for (int i = 0; i < n; i++) {
      list2.add(scanner.nextInt());
    }

    int max = 0;
    int candies = 0;

    for (int i = 0; i < list1.size(); i++) {
      // list1は、iまでの要素の合計
      // list2は、i以降の要素の合計
      // list1
      for (int j = 0; j <= i; j++) {
        candies = candies + list1.get(j);
      }
      for (int k = i; k < list2.size(); k++) {
        candies = candies + list2.get(k);
      }

      if (max < candies) {
        max = candies;
      }

      candies = 0;
    }

    System.out.println(max);

  }

}
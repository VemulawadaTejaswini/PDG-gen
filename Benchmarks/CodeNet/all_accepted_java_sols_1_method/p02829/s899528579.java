import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3));
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    set.remove(number1);
    set.remove(number2);
    for (Integer integer : set) {
      System.out.println(integer);
    }
  }

}

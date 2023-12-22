import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();

    for (int i = 0; i < 2; i++) {
      int input = sc.nextInt();
      ary.add(input);
    }

    int a = ary.get(0);
    int b = ary.get(1);

    if (a < b) {
      System.out.println("a < b");
    } else if (a > b) {
      System.out.println("a > b");
    } else {
      System.out.println("a == b");
    }
  }
}
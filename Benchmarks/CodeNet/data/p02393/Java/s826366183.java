import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      int input = sc.nextInt();
      ary.add(input);
    }

    int a = ary.get(0);
    int b = ary.get(1);
    int c = ary.get(2);
    Collections.sort(ary);

    for (int j = 0; j < ary.size(); j++) {
      if (j == ary.size() - 1) {
        System.out.println(ary.get(j));
      } else {
        System.out.print(ary.get(j) + " ");
      }
    }
  }
}
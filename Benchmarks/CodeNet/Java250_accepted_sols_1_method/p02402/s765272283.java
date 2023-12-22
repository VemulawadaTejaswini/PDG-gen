import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> ary = new ArrayList<>();

    while (true) {
      int a = sc.nextInt();
      ary.add(a);
      if (ary.size() == n) break;
    }

    int max_a = Collections.max(ary);
    int min_a = Collections.min(ary);
    long sum_a = 0;
    for (int sum : ary) {
      sum_a += sum;
    }
    System.out.println(min_a + " " + max_a + " " + sum_a);
  }
}
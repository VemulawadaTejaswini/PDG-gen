import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    //??\?????¨?????????
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();
    while (sc.hasNextInt()) {
        int input = sc.nextInt();
        ary.add(input);
    }

    int a = ary.get(0);
    int b = ary.get(1);

    int s = a * b;
    int m = (a * 2) + (b * 2);

    System.out.println(s + " " + m);

  }
}
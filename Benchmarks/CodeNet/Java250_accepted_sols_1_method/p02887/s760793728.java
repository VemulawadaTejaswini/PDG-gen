
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    List<Character> list = new ArrayList<Character>();

    for (int i = 0; i < N; i++) {

      if (i == 0) {
        list.add(S.charAt(i));
        continue;
      }

      if (S.charAt(i) != S.charAt(i - 1)) {
        list.add(S.charAt(i));
      }
    }

    System.out.println(list.size());

    sc.close();
  }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> card = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      card.add(sc.nextInt());
    }

    boolean[] mark = new boolean[9];
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int b = sc.nextInt();
      for (int j = 0; j < 9; j++) {
        if (card.get(j) == b) {
          mark[j] = true;
        }
      }
    }

    if ((mark[0] && mark[1] && mark[2]) ||
        (mark[3] && mark[4] && mark[5]) ||
        (mark[6] && mark[7] && mark[8]) ||
        (mark[0] && mark[3] && mark[6]) ||
        (mark[1] && mark[4] && mark[7]) ||
        (mark[2] && mark[5] && mark[8]) ||
        (mark[0] && mark[4] && mark[8]) ||
        (mark[2] && mark[4] && mark[6])) {
      System.out.println("Yes");
      return;
    }

    System.out.println("No");

    sc.close();
  }
}
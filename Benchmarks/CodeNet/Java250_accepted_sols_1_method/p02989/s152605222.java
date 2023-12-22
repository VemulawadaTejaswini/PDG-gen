import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    List<Integer> list = new ArrayList<>(N);

    for (int i = 0; i < N; i++) {
      list.add(scan.nextInt());
    }

    Collections.sort(list);
    System.out.println(list.get(N / 2) - list.get(N / 2 - 1));
  }
}

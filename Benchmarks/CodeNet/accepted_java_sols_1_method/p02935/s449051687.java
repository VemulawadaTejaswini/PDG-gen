import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    LinkedList<Double> v = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      v.add(sc.nextDouble());
    }

    Collections.sort(v);

    while (v.size() > 1) {
      double a = v.poll();
      double b = v.poll();
      v.addFirst((a + b) / 2.0);
    }

    System.out.println(v.get(0));
  }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<Double> list = new ArrayList<Double>();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextDouble());
    }

    for (int i = 0; i < (n - 1); i++) {
      Collections.sort(list);
      list.add((list.get(0) + list.get(1)) / 2);
      list.remove(0);
      list.remove(0);
    }

    System.out.println(list.get(0));

  }
}
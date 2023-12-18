import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int k = scanner.nextInt();
    final List<Integer> h = new ArrayList<>();


    for (int i = 0; i < n; i++) {
      h.add(scanner.nextInt());
    }
    Collections.sort(h);


    if(n > k) {
      long count = 0;
      for (int i = 0; i < n-k; i++) {
        count += h.get(i);
      }
      System.out.println(count);
    } else {
      System.out.println(0);
    }

  }
}

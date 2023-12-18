import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Long n = s.nextLong();
    List<Long> a = new ArrayList<Long>();
    for (int i = 0; i < n; i++) {
      a.add(s.nextLong());
    }
    Long min = Collections.min(a);
    Long max = Collections.max(a);
    Long sum = 0L;
    for (Long elem : a) {
      sum += elem;
    }
    System.out.println(min + " " + max + " " + sum);
    s.close();
  }
}


import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashSet<String> list = new HashSet<String>();
    for (int i = 0; i < N; i++) {
      list.add(sc.next());
    }
    if (list.size() == 3) {
      System.out.println("Three");
    } else {
      System.out.println("Four");
    }
  }
}

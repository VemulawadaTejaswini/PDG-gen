import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++) {
      list.add(sc.nextInt());
    }
    sc.close();
    Collections.sort(list);
    System.out.println(list.get(0) + list.get(1));
  }
}

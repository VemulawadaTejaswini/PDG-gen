import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    List<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      a.add(s.nextInt());
    }
    Collections.reverse(a);
    for (int i = 0; i < a.size(); i++) {
      System.out.print(a.get(i));
      if (i != a.size() - 1)
        System.out.print(" ");
    }
    System.out.println();
    s.close();
  }
}


import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

    hashmap.put(0, 0);
    for (int i = 1; i < n; i++) {
      hashmap.put(i, 0);
    }
    for (int i = 1; i < n; i++) {
      int a = sc.nextInt() - 1;
      int old = hashmap.get(a);
      hashmap.replace(a, old + 1);
    }
    for (int i = 0; i < n; i++) {
      System.out.println(hashmap.get(i));
    }

    sc.close();

  }
}
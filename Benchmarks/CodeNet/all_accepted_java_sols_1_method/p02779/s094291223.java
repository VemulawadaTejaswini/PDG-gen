import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
      boolean ans = true;
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt() - 1;
        if (cnt.containsKey(a)) ans = false;
        cnt.put(a, 1);
      }
      System.out.println(ans ? "YES" : "NO");
    } finally {
      sc.close();
    }
  }
}
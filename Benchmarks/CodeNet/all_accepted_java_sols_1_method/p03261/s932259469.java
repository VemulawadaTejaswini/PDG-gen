import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      boolean ans = true;
      String pre = "";
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        String s = sc.next();
        if (i > 0 && s.charAt(0) != pre.charAt(pre.length()-1)) {
          ans = false;
        }
        if (map.containsKey(s)) ans = false;
        map.put(s, 1);
        pre = s;

      }
      System.out.println(ans ? "Yes" : "No"); 
    } finally {
      sc.close();
    }
  }
}

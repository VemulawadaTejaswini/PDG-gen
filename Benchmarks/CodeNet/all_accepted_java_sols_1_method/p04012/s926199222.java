import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String w = sc.next();

    sc.close();

    String[] W = w.split("");
    
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < W.length; i++) {
      if (hashMap.containsKey(W[i])) {
        int v = hashMap.get(W[i]);
        hashMap.put(W[i], v + 1);
      } else {
        hashMap.put(W[i],1);
      }
    }

    boolean valid = true;

    for (int i = 0; i < W.length; i++) {
      int v = hashMap.get(W[i]);
      if (v % 2 != 0) {
        valid = false;
        break;
      }
    }

    if (valid) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
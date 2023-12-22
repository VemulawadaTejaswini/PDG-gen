import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (map.containsKey(a)) {
        map.put(a,map.get(a) + 1);
      } else {
        map.put(a,1);
      }
    }

    sc.close();

    int count = 0;

    for (int key : map.keySet()) {
      if (key <= map.get(key)) {
        count += map.get(key) - key;
      } else {
        count += map.get(key);
      }
    }

    System.out.println(count);

  }

}
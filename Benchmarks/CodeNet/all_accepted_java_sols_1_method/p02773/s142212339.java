import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    Map<String, Integer> map = new HashMap<>();

    int max = 1;

    for (int i = 0; i < N; i++) {
      String s = sc.next();
      if (map.containsKey(s)) {
        map.put(s, map.get(s)+1);
        if (map.get(s) > max) max = map.get(s);
      } else {
        map.put(s, 1);
      }
    }

    List<String> list = new ArrayList<>();

    for (Map.Entry<String, Integer> e : map.entrySet()) {
      if (e.getValue() == max) {
        list.add(e.getKey());
      }
    }

    Collections.sort(list);
    for (String s : list) {
      System.out.println(s);
    }

    sc.close();
  }
}
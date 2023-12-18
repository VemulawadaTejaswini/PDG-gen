import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int L = sc.nextInt();

    TreeMap<String, Integer> hashMap = new TreeMap<>();

    for (int i = 0; i < N; i++) {
      String s_ = sc.next();
      if (hashMap.containsKey(s_)) {
        Integer v_ = hashMap.get(s_);
        hashMap.put(s_,v_ + 1);
      } else { 
        hashMap.put(s_,1);
      }
    }

    sc.close();

    for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
      for (int i = 0; i < map.getValue(); i++) {
        System.out.print(map.getKey());
      }
    }

    System.out.println("");

  }

}
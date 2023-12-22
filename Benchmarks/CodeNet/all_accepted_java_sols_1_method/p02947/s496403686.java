import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String[] s = new String[N];
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String s_ = sc.next();
      s = s_.split("");
      Arrays.sort(s);
      String s2 = "";
      for (int j = 0; j < s.length; j++) {
        s2 += s[j];
      }
      if (hashMap.containsKey(s2)) {
        Integer v = hashMap.get(s2);
        hashMap.put(s2, v + 1);
      } else {
        hashMap.put(s2, 1);
      }
    }

    sc.close();

    long count = 0;

    for (Integer value : hashMap.values()) {
      if (1 < value) {
        for (int i = 2; i <= value; i++) {
          count += i - 1;  
        }
      }
    }

    System.out.println(count);

  }

}
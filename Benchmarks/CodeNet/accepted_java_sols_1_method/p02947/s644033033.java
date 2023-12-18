import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String s = sc.next();
      String[] s_ = s.split("");
      Arrays.sort(s_);
      String ss_ = "";
      for (int j = 0; j < s_.length; j++) {
        ss_ += s_[j];
      }
      if (hashMap.containsKey(ss_)) {
        int v_ = hashMap.get(ss_);
        hashMap.put(ss_, v_ + 1);
      } else {
        hashMap.put(ss_, 1);
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
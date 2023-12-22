import java.util.*;
import java.util.stream.*;

class Main {
  static final List<String> RESULT_TYPE = 
  Collections.unmodifiableList(Arrays.asList("AC", "WA", "TLE", "RE"));
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> result = new HashMap<>();
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      String judge = sc.next();
      result.put(judge, result.get(judge) == null ? 1 : result.get(judge) + 1);
    }
    dispResult(result);
  }
  static void dispResult(Map<String, Integer> result) {
    for (String R : RESULT_TYPE) {
      System.out.println(R + " x " + (result.get(R) == null ? 0 : result.get(R)));
    }
  }
}



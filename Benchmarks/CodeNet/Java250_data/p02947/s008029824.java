import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    Map<String,Long> groupMap;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      groupMap = new HashMap<>();
      for(int i = 0; i < N; i++) {
        String ns = normed(sc.next());
        Long count = groupMap.get(ns);
        if ( count == null ) {
          count = 0L;
        }
        count++;
        groupMap.put(ns, count);
      }
    }
    long answer = 0;
    for(Long count : groupMap.values()) {
      if ( count > 1 ) {
	    answer += count * (count - 1) / 2;
      }
    }
    System.out.println(answer);
  }
  
  private static String normed(String s) {
    if ( s == null ) {
      return null;
    }
    char[] ca = s.toCharArray();
    Arrays.sort(ca);
    return new String(ca);
  }

}
import java.util.*;
public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean allZero = true;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0)+1);
      if (a != 0) {
        allZero = false;
      }
    }
    if (allZero) {
      System.out.println("Yes");
      return;
    }
    
    if (N%3 != 0 || (map.size() != 2 && map.size() != 3)) {
      System.out.println("No");
      return;
    }
    if (map.size() == 2) {
      System.out.println(map.getOrDefault(0, -1) == N/3 ? "Yes" : "No");
    } else {
      Set<Integer> count = new HashSet<>();
      for (int c : map.values()) {
        count.add(c);
      }
      if (count.size() != 1) {
        System.out.println("No");
        return;
      }
      Iterator<Integer> itr = map.keySet().iterator();
      int x = itr.next();
      int y = itr.next();
      int z = itr.next();
      
      System.out.println((x^y) == z ? "Yes" : "No");
    }
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, Integer> seen = new HashMap<>();
    
    int count = scanner.nextInt();
    for (int ix = 0; ix < count; ix++) {
      int value = scanner.nextInt();
      seen.put(value - 1, seen.getOrDefault(value - 1, 0) + 1);
      seen.put(value, seen.getOrDefault(value, 0) + 1);
      seen.put(value + 1, seen.getOrDefault(value + 1, 0) + 1);
    }
 
    int maximum = 0;
    for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
      maximum = Math.max(maximum, entry.getValue()); 
    }
    
    System.out.println(maximum);
  }
}

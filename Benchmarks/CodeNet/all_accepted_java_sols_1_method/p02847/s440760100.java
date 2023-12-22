import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    HashMap<String, Integer> m = new HashMap<String, Integer>(7);
    m.put("SUN", 7);
    m.put("MON", 6);
    m.put("TUE", 5);
    m.put("WED", 4);
    m.put("THU", 3);
    m.put("FRI", 2);
    m.put("SAT", 1);

    System.out.println(m.get(S));
  }
}
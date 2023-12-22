import java.util.*;

class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();
    
    HashMap<String, Integer> days = new HashMap();
    days.put("SAT", 1);
    days.put("FRI", 2);
    days.put("THU", 3);
    days.put("WED", 4);
    days.put("TUE", 5);
    days.put("MON", 6);
    days.put("SUN", 7);
    
    System.out.println(days.get(S));
  }
}
import java.util.*;
public class Main {
  public static void main(String[] args){
    Map<String, Integer> m = new HashMap<>();
    m.put("SUN", 7);
    m.put("MON", 6);
    m.put("TUE", 5);
    m.put("WED", 4);
    m.put("THU", 3);
    m.put("FRI", 2);
    m.put("SAT", 1);


    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    System.out.println(m.get(a));

    sc.close();
  }
}

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> m = new HashMap<String, String>();
    m.put("22", "Christmas Eve Eve Eve");
    m.put("23", "Christmas Eve Eve");
    m.put("24", "Christmas Eve");
    m.put("25", "Christmas");
    String d = sc.next();
    System.out.println(m.get(d));
  }
}

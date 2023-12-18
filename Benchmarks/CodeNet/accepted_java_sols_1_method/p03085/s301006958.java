import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    Map<String, String> enki = new HashMap<String, String>();
    enki.put("A", "T");
    enki.put("T", "A");
    enki.put("C", "G");
    enki.put("G", "C");
    System.out.print(enki.get(x));
  }
}

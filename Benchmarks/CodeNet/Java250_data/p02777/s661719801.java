import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    Map<String, Integer> map = new HashMap<>();
    map.put(s, sc.nextInt());
    map.put(t, sc.nextInt());
    String u = sc.next();
    map.put(u, map.get(u) - 1);
    StringBuilder sb = new StringBuilder();
    sb.append(map.get(s));
    sb.append(" ");
    sb.append(map.get(t));
    System.out.println(sb.toString());
  }
}
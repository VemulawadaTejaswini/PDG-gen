import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    HashSet<String> set = new HashSet<String>();
    for(int i = 0; i < s.length(); i++) {
      for(int j = i + 1; j <= Math.min(s.length(), i + k); j++) {
        String str = s.substring(i, j);
        set.add(str);
      }
    }
    ArrayList<String> list = new ArrayList<String>();
    for(Iterator<String> i = set.iterator(); i.hasNext();) {
      list.add(i.next());
    }
    Collections.sort(list);
    System.out.println(list.get(k - 1));
  }
}
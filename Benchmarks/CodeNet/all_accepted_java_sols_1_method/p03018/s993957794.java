
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'B') {
        if((i < (s.length() - 1)) && (s.charAt(i + 1) == 'C')) {
          list.add(3);
          i++;
        } else {
          list.add(1);
        }
      } else {
        if(s.charAt(i) == 'A') {
          list.add(0);
        } else {
          list.add(2);
        }
      }
    }
    long ans = 0;
    long p = 0;
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i) == 3) {
        ans += p;
      } else if(list.get(i) == 0) {
        p++;
      } else {
        p = 0;
      }
    }
    System.out.println(ans);
  }
}
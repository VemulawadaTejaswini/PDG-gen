import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
 //   ArrayList<Integer> list = new ArrayList<Integer>();
    int p = 0;
    long ans = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'W') {
        ans += ((long)(i - p));
        p++;
      }
    }
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] st = new String[5];
    st[0] = "hi";
    for(int i = 1; i < 5; i++) {
      st[i] = st[i - 1] + "hi";
    }
    String ans = "No";
    for(int i = 0; i < 5; i++) {
      if(s.equals(st[i])) ans = "Yes";
    }
    System.out.println(ans);
  }
}
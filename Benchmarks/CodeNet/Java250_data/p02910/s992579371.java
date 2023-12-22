import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = 0;
    String ans = "Yes";
    for(int i = 0; i < s.length(); i++) {
      if(((i % 2) == 0) && (s.charAt(i) == 'L')) p++;
      if(((i % 2) == 1) && (s.charAt(i) == 'R')) p++;
    }
    if(p > 0) ans = "No";
    System.out.println(ans);
  }
}
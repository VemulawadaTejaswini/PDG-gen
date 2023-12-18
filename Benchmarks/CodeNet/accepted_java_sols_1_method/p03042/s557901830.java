import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s1 = s.substring(0, 2);
    String s2 = s.substring(2);
    int t1 = Integer.parseInt(s1);
    int t2 = Integer.parseInt(s2);
    String ans = "NA";
    int p = 0;
    if((t2 > 0) && (t2 <= 12)) {
      ans = "YYMM";
      p++;
    }
    if((t1 > 0) && (t1 <= 12)) {
      ans = "MMYY";
      p++;
    }
    if(p == 2) ans = "AMBIGUOUS";
    System.out.println(ans);
  }
}
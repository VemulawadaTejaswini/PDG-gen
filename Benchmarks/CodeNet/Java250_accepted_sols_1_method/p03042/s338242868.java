import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s1 = s.substring(0, 2);
    String s2 = s.substring(2);
    int t1 = Integer.parseInt(s1);
    int t2 = Integer.parseInt(s2);
    int p1 = 0;
    int p2 = 0;
    if((t2 > 0) && (t2 <= 12)) p1++;
    if((t1 > 0) && (t1 <= 12)) p2++;
    String ans = "NA";
    if(p1 == 1) {
      if(p2 == 1) {
        ans = "AMBIGUOUS";
      } else {
        ans = "YYMM";
      }
    } else {
      if(p2 == 1) ans = "MMYY";
    }
    System.out.println(ans);
  }
}
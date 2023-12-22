import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans =0;
    String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for (int i=0; i<7; i++) {
      if(week[i].equals(S)) {
        ans = 7-i;
        break;
      }
    }
    System.out.println(ans);
  }
}
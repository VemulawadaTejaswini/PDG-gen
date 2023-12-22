import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    String[] days = {
      "SUN","MON","TUE","WED","THU","FRI","SAT"
    };
    
    long ans = 0;
    for (int i = 0; i < days.length; i++) {
      if (days[i].equals(S)) ans = 7 - i;
    }
    System.out.println(ans);
  }
}
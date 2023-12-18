import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    if(s.equals("SUN")) {
      ans = 7;
    } else if(s.equals("MON")) {
      ans = 6;
    } else if(s.equals("TUE")) {
      ans = 5;
    } else if(s.equals("WED")) {
      ans = 4;
    } else if(s.equals("THU")) {
      ans = 3;
    } else if(s.equals("FRI")) {
      ans = 2;
    } else{
      ans = 1;
    }
    System.out.println(ans);
  }
}
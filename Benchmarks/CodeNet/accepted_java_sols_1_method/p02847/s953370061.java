import java.util.*;

public class Main {
  public static void main(String args[]) {
    String[] wdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    sc.close();
    
    for (int i = 0; i < 7; i++) {
      if (S.equals(wdays[i])) {
        System.out.println(7 - i);
        break;
      }
    }
  }
}
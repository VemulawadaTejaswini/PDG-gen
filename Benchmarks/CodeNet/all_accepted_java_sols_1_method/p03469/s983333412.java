import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = "";
    for(int i = 0; i < s.length(); i++) {
      if(i == 3) {
        t += "8";
      } else {
        t += String.valueOf(s.charAt(i));
      }
    }
    System.out.println(t);
  }
}

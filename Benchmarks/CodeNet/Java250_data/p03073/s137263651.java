import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int count01 = 0;
    int count10 = 0;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (i%2 == 0) {
        if (c == '0') {
          count10++;
        } else {
          count01++;
        }
      } else {
        if (c == '1') {
          count10++;
        } else {
          count01++;
        }
      }
    }
        
    System.out.println(Math.min(count01, count10));
  }  
}
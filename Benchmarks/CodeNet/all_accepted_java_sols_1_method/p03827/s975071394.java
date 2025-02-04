import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int max = 0;
    int x = 0;
    for(int i = 0; i < S.length(); i++) {
      if(S.charAt(i) == 'I') {
        x += 1;
      } else {
        x -= 1;
      }
      max = Math.max(max, x);
    }
    System.out.println(max);
  }
}
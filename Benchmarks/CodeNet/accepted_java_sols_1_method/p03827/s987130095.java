import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    int v = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'I') {
        v++;
      } else {
        v--;
      }
      max = Math.max(max, v);
    }
 
    System.out.println(max);
  }
}
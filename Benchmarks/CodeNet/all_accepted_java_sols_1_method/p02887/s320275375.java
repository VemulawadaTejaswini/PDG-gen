import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();
    
    char prev = '0';
    int ans = 0;
    for(int i=0; i<S.length(); i++) {
      if(S.charAt(i) != prev) { ans++; }
      prev = S.charAt(i);
    }
    System.out.println(ans);
  }
}
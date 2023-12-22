import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for(int i = n; i <= 999; i++) {
      String s = String.valueOf(i);
      if((s.charAt(0) == s.charAt(1)) && (s.charAt(1) == s.charAt(2))) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}

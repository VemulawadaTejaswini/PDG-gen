import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    
    int ans = 0;
    for(int i=0,j=S.length()-1; i<=j; i++,j--) {
      if(S.charAt(i) != S.charAt(j)) ans++;
    }
    
    System.out.println(ans);
  }
}
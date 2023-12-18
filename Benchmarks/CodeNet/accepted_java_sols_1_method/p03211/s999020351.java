import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N;
    int ans = 999;
    int sa;
    
    String S = sc.next();
    for(int i=0; i<S.length()-2; i++) {
      N = S.substring(i, i+3);
      if(753<=Integer.parseInt(N)) {
        sa = Integer.parseInt(N) - 753;
      } else {
        sa = 753 - Integer.parseInt(N);
      }
      
      if(ans >=sa){
        ans = sa;
      }
    }
    System.out.println(ans);
  }
}
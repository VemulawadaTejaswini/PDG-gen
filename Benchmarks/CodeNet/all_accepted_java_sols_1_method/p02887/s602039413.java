import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 1;
    
    String[] ary = s.split("");
    
    for(int i = 1; i < n; i++) {
        if(!ary[i].equals(ary[i-1])) ans += 1;
    }
    
    System.out.println(ans);
  }
}

import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int minMod10 = 10;
    int ans = 0;
    for (int i = 0; i < 5; i++) {
      int wait = sc.nextInt();
      int mod10 = wait % 10;
      if (mod10 == 0) {
        ans += wait;
      } else {
        ans +=(wait/10 + 1) * 10;
        if (mod10 < minMod10) {
          minMod10 = mod10;
        }
      }
    }
    
    if (minMod10 != 10) {
      ans -= (10-minMod10);
    }

    System.out.println(ans);
  }  
}

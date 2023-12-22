import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    boolean[] rui = new boolean[x + 1];
    rui[1] = true;
    for(int b = 2; b <= x; b++) {
      int s = (b * b);
      while(s <= x) {
        rui[s] = true;
        s *= b;
      }
    }
    int ans = 1;
    for(int i = x; i >= 1; i--) {
      if(rui[i]) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}

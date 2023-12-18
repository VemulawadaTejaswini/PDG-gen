import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int w[] = new int[n];
    int ans = 10000;
    int t = 0;
    for (int i=0; i<n; i++){
      w[i] = Integer.parseInt(sc.next());
      t += w[i];
    }
    
    int w1 = 0;
    int w2;
    int ab = 0;
    
    for(int i=0; i<n; i++){
      w1 += w[i];
      w2 = t - w1;
      ab = Math.abs(w1 - w2);
      if(ans>ab) {
        ans = ab;
      }
    }
    
    System.out.println(ans);
  }
}

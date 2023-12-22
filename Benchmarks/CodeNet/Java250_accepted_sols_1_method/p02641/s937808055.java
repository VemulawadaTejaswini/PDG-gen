import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      int p = sc.nextInt();
      list.add(p);
    }
    int ans = 0;
    int t = x;
    for(int i = 1; i <= 101; i++) {
      if(!list.contains(i)) {
        if(Math.abs(x - i) < t) {
          t = Math.abs(x - i);
          ans = i;
        }
      }
    }
    System.out.println(ans);
  }
}
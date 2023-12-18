import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] t1 = new int[n];
    int[] t2 = new int[m];
    for(int i = 0; i < n; i++) {
      t1[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++) {
      t2[i] = sc.nextInt();
    }
    int p = 0;
    for(int i = x + 1; i <= y; i++) {
      int s = 0;
      for(int j = 0; j < n; j++) {
        if(t1[j] >= i) s = 1;
      }
      for(int j = 0; j < m; j++) {
        if(t2[j] < i) s = 1;
      }
      if(s == 0) p = 1;
    }
    String ans = "War";
    if(p == 1) ans = "No War";
    System.out.println(ans);
  }
}
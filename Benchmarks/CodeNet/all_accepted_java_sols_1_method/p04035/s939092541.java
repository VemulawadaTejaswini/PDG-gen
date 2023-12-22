import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long L = sc.nextLong();
    long[] a = new long[n];
    String ans = "Impossible";
    int p = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < n - 1; i++) {
      if((a[i] + a[i + 1]) >= L) {
        p = i + 1;
        ans = "Possible";
        break;
      }
    }
    System.out.println(ans);
    if(ans.equals("Possible")) {
      for(int i = 1; i < p; i++) {
        System.out.println(i);
      }
      for(int i = n - 1; i > p; i--) {
        System.out.println(i);
      }
      System.out.println(p);
    }
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    sc.nextLine();
    int[] m = new int[n];
    int minm = 100000;
    int s = 0;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      m[i] = Integer.parseInt(sc.nextLine());
      s += m[i];
      if(minm > m[i])
        minm = m[i];
    }
    ans = n + (x - s) / minm;
    System.out.println(ans);
  }
}
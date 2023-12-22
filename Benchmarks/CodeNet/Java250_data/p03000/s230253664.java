import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();

    int[] l = new int[n + 1];
    for (int i = 1; i < n + 1; i++) {
      l[i] = sc.nextInt();
    }

    int d = 0;
    int ans = 1;
    for (int i = 0; i < n; i++) {
      if (d + l[i + 1] > x) {
        break;
      } else {
        ans++;
        d += l[i + 1];
      }
    }
    
    System.out.println(ans);
  }
}

import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    int max = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      max = Math.max(max, a[i]);
    }

    for (int i = 0; i < n; i++) {
      if (a[i] == max) {
        int ans = 0;
        for (int j = 0; j < n; j++) {
          if(i != j && a[j] == max) {
            ans = max;
            break;
          } else if (i != j) {
            ans = Math.max(ans, a[j]);
          }
        }
        System.out.println(ans);
      } else {
        System.out.println(max);
      }
    }
    
  }
}

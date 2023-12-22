import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    System.out.println(dfs(h));
  }

  public static int dfs(int[] hana) {
    int m = 100;
    for(int i = 0; i < hana.length; i++) {
      m = Math.min(m, hana[i]);
    }
    int ans = m;
    for(int i = 0; i < hana.length; i++) {
      hana[i] -= m;
    }
    int p = -1;
    int q = -1;
    int t = 0;
    for(int i = 0; i < hana.length; i++) {
      if(hana[i] > 0) {
        if(t == 0) {
          p = i;
          t = 1;
        } else {

        }
      } else {
        if(t == 1) {
          q = i - 1;
          t = 0;
          int[] hana2 = new int[q - p + 1];
          for(int j = 0; j < q - p + 1; j++) { 
            hana2[j] = hana[j + p];
          }
          ans += dfs(hana2);
          p = -1;
        }
      }
      if((i == hana.length - 1) && (p != -1)) {
        q = hana.length - 1;
        int[] hana2 = new int[q - p + 1];
        for(int j = 0; j < q - p + 1; j++) { 
          hana2[j] = hana[j + p];
        }
        ans += dfs(hana2);
      }
    }
    return ans;
  }
}

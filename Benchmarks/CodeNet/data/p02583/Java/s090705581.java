import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    int[] l = new int[n];
    for (int cnt = 0; cnt < n; cnt++) {
      l[cnt] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          if (i > j && j > k) {
            if (l[i] != l[j] && l[j] != l[k] && l[k] != l[i]) {
              if (l[i] < (l[j] + l[k]) && l[j] < (l[i] + l[k]) && l[k] < (l[i] + l[j])) {
                ans++;
              }
            }
          }
        }
      }
    }
    System.out.println(ans);
    sc.close();
  }
}

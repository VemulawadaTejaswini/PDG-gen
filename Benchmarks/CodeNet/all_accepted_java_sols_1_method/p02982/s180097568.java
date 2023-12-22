import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();
    String dummy = sc.nextLine();
    
    int[][] x = new int[n][d];

    for (int i = 0; i < n; i++) {
      String[] s = sc.nextLine().split(" ");
      for (int j = 0; j < d; j++) {
        x[i][j] = Integer.parseInt(s[j]);
      }
    }

    
    int ans = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int sum = 0;
        for (int k = 0; k < d; k++) {
          sum += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
        }
        if (Math.sqrt(sum) == (int)Math.sqrt(sum)) ans++;
      }
    }

    System.out.println(ans);
  }
}

import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[][] data =  new int[n+1][k+1];

    for (int i = 1; i < k+1; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        data[sc.nextInt()][i]++;
      }
    }

    int count = 0;
    int ans = 0;

    for (int i = 1; i < n+1; i++) {
      for (int j = 1; j < k+1; j++) {
        if (data[i][j] != 0) {
          count++;
        }
      }
      if (count == 0) {
        ans++;
      }
      count = 0;
    }

    System.out.println(ans);




  }

}

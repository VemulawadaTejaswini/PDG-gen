import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      int ans = 0;
      double sum = 0;
      
      double[][] ary = new double[n][d];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < d; j++) {
          ary[i][j] = Double.parseDouble(sc.next());
        }
      }
      
      for (int i = 0; i < n -1; i++) {
        for (int k = 1;k < n-i;k++) {
          sum = 0;
          for (int j = 0; j < d; j++) {
            sum += Math.pow((ary[i][j]-ary[i+k][j]),2);
          }
          if (Math.sqrt(sum) % 1 == 0) {
            ans += 1;
          }
        }
      }
      System.out.print(ans);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final String[] tmp1 = br.readLine().split("\\s");
      final int n = Integer.parseInt(tmp1[0]);
      final int m = Integer.parseInt(tmp1[1]);
      final int c = Integer.parseInt(tmp1[2]);

      final int[] b = new int[m];
      final String[] tmp2 = br.readLine().split("\\s");
      for (int i = 0; i < tmp2.length; i++) {
        b[i] = Integer.parseInt(tmp2[i]);
      }

      int result = 0;

      final int[][] a = new int[n][m];
      for (int i = 0; i < a.length; i++) {
        int sum = 0;
        final String[] tmp3 = br.readLine().split("\\s");
        for (int j = 0; j < a[i].length; j++) {
          a[i][j] = Integer.parseInt(tmp3[j]);
          sum += a[i][j] * b[j];
        }
        if (0 < sum + c) {
          result++;
        }
      }
      System.out.print(result);

    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}

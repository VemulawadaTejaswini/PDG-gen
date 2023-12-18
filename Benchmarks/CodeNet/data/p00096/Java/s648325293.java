import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    final int LIMIT = 1000;
    while (input.ready()) {
      final int num = Integer.valueOf(input.readLine());
      Long ans = 0L;
      int INIT_I = num;
      int INIT_J = num;
      int INIT_K = num;
      if (num > LIMIT) {
        INIT_I = LIMIT;
      } else {
        INIT_I = num;
      }
      if (num - LIMIT > LIMIT) {
        INIT_J = LIMIT;
      }
      if (num - LIMIT * 2 > LIMIT) {
        INIT_K = LIMIT;
      }
      for (int i = INIT_I; i >= 0; i--) {
        for (int j = Math.max(INIT_J, INIT_I - i); j >= 0; j--) {
          for (int k = Math.max(INIT_K, INIT_J - (i + j)); k >= 0; k--) {
            for (int l = num - (i + j + k); l >= 0; l--) {
              
              if (i + j + k + l == num) {
                ans++;
              }
            }
          }
        }
      }
      System.out.println(ans);
    }
  }
}
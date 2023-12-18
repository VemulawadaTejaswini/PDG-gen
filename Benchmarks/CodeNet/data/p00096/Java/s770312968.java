import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    try {
      while (input.ready()) {
        final int num = Integer.valueOf(input.readLine());
        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
          if (num < (i))
            break;
          for (int j = 0; j <= 1000; j++) {
            if (num < (i + j))
              break;
            for (int k = 0; k <= 1000; k++) {
              if (num < (i + j + k))
                break;
              for (int l = 0; l <= 1000; l++) {
                if (num < (i + j + k + l))
                  break;
                if (i + j + k + l == num) {
                  ans += 1;
                }
              }
            }
          }
        }
        System.out.println(ans);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
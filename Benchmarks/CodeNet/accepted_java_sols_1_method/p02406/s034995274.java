import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int i = 1;
    CHECK_NUM:
    while (true) {
      int x = i;
      if (x % 3 == 0) {
        System.out.print(" " + i);
        if (++i <= n)
          continue;
        else
          break;
      }
      INCLUDE3:
      while (true) {
        if (x % 10 == 3) {
          System.out.print(" " + i);
          if (++i <= n)
            continue CHECK_NUM;
          else
            break CHECK_NUM;
        }
        x /= 10;
        if (x != 0); else {
          if (++i <= n)
            continue CHECK_NUM;
          else
            break CHECK_NUM;
        }
      }
    }
    System.out.println();
  }

}
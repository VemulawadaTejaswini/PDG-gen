import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] stri = str.split(" ");

    int ans = 0;
    int totyu = 0;
    for (int i = 0; i < stri.length; i += 3) {
      boolean check;
      if (i + 3 < stri.length) {
        check = isKakeru(stri[i + 3]);
      } else {
        check = false;
      }
      int i1 = Integer.parseInt(stri[i]);
      int i2 = Integer.parseInt(stri[i + 1]);

      if (check) {
        if (totyu == 0) {
          totyu = 1;
        }
        switch (stri[i + 2]) {
          case "+":
            totyu *= i1 + i2;
            break;
          case "-":
            totyu *= i1 - i2;
            break;
        }
      } else {
        switch (stri[i + 2]) {
          case "+":
            ans += totyu + i1 + i2;
            break;
          case "-":
            ans += totyu + i1 - i2;
            break;
        }
        totyu = 0;
      }
    }
    System.out.println(ans);
  }

  public static boolean isKakeru(String str) {
    if (str.equals("*")) {
      return true;
    } else {
      return false;
    }
  }
}
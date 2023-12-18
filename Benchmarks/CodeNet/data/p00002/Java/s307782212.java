import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready()) {
      String numStr[] = input.readLine().split(" ");
      int num[] = new int[2];
      num[0] = Integer.parseInt(numStr[0]);
      num[1] = Integer.parseInt(numStr[1]);

      System.out.println(getDigitNumber(num[0] + num[1]));

      ;
    }
  }

  public static int getDigitNumber(int num) {

    int digit = 1;
    while (num / 10 >= 1) {
      num /= 10;
      digit++;
    }
    return digit;
  }
}
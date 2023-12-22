import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    // 10^15以上は、打ち切りでよい
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();

    int idx = 0;
    for(int i = 0; i < K - 1; i++) {
      if (S.length() <= i ) {
        idx = S.length() - 1;
        break;
      } else if (S.charAt(i) != '1') {
        // = (int)(S.charAt(i) - '0');
        idx = i;
        break;
      }

      idx++;
    }

    System.out.println(S.charAt(idx));
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      var modulo = (long)Math.pow(10, 9) + 7L;
      var modulo2 = calcModulo2((long)Math.pow(10, 9) + 5L);

      var sum = 0L;
      for (int i = 0; i < a.length; i++) {
        sum = (sum + a[i]) % modulo;
      }
      sum = (sum * sum) % modulo;

      for (int i = 0; i < a.length; i++) {
        sum = (sum - (a[i] * a[i]) % modulo) % modulo;
        while (sum < 0) {
          sum = (sum + modulo) % modulo;
        }
      }

      sum = (sum * (modulo2 % modulo)) % modulo;

      System.out.println(sum);
    }
  }

  private static long calcModulo2(long target) {
    var modulo = (long)Math.pow(10, 9) + 7L;

    var current = 1;
    var answer = 2L;
    while (current <= target / 2) {
      answer = (answer * answer) % modulo;
      current = current * 2;
    }

    if (current < target) {
      return answer * calcModulo2(target - current) % modulo;
    } else {
      return answer;
    }
  }
}
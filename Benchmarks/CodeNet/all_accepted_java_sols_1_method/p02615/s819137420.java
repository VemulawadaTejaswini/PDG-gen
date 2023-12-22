import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());
      final var a = Arrays
        .stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      Arrays.sort(a);

      long sum = a[a.length - 1];
      var rest = n - 2;
      var idx = a.length - 2;
      while (rest >= 2) {
        sum += a[idx] * 2;
        rest -= 2;
        idx--;
      }

      if (rest >= 1) {
        sum += a[idx];  
      }      
      System.out.println(sum);
    }
  }
}

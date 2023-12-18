import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var line = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .boxed()
        .collect(Collectors.toSet());

      System.out.println(line.size());
    }
  }
}

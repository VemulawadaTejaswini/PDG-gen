import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class IPA1_1_C {
  public static void main(String...args) throws Exception {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> list = stdin.lines()
      .flatMap(
        v -> Arrays.asList(v.split(" ")).stream())
      .mapToInt(Integer::parseInt)
      .boxed()
      .collect(Collectors.toList());

    int area = list.stream()
      .mapToInt(Integer::intValue)
      .reduce(1, (a,b) -> a * b );

    int perimeter = list.stream()
      .mapToInt(Integer::intValue)
      .sum() * 2;


    out.printf("%d %d\n", area, perimeter);

  }
}
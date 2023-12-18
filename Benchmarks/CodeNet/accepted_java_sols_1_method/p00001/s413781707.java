import java.util.*;
import java.util.stream.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .parallel()
      .map(Integer::parseInt)
      // .boxed()
      .sorted(Comparator.reverseOrder())
      .sequential()
      .limit(3)
      .forEach(System.out::println);
  }
}
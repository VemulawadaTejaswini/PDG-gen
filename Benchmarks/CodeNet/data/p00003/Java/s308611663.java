import java.util.*;
import java.util.stream.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .skip(1)
      .parallel()
      .map(line -> Stream.of(line.split(" "))
                    .parallel()
                    .mapToInt(Integer::parseInt)
                    .map(n -> n * n)
                    .sorted()
                    .toArray())
      .map(ar -> (ar[0] + ar[1] == ar[2]) ? "YES" : "NO")
      .sequential()
      .forEach(System.out::println);
  }
}
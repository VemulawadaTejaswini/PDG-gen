import java.io.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .parallel()
      .map(line -> line.split(" "))
      .map(ar -> Stream.of(ar).mapToInt(Integer::parseInt).sum())
      .map(String::valueOf)
      .mapToInt(str -> str.length())
      .sequential()
      .forEach(System.out::println);
  }
}
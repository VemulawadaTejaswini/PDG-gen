import java.io.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .parallel()
      .map(line -> String.valueOf(Stream.of(line.split(" ")).mapToInt(Integer::parseInt).sum()).length())
      // .sequential()
      .forEach(System.out::println);
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      br.lines()
        .filter(s -> !s.equals("0") && !s.isEmpty())
        .mapToInt(s -> IntStream.range(0,s.length())
          .parallel()
          .map(i -> Character.getNumericValue(s.charAt(i)))
          .sum() )
        .forEach(System.out::println);
    }
  }
}

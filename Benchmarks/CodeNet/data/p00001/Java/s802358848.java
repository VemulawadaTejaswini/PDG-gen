import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      br.lines()
        .map(Integer::valueOf)
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .forEach(System.out::println);
    }
  }
}

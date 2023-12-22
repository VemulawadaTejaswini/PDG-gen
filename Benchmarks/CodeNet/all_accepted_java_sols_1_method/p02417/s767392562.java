import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      char ca = "a".charAt(0);
      char cz = "z".charAt(0);
      int[] count = new int[26];

      br.lines()
        .filter(s -> s != null && !s.isEmpty())
        .map(String::toLowerCase)
        .map(s -> IntStream.range(0,s.length())
          .mapToObj(i -> s.charAt(i))
          .filter(c -> !(ca > c  || c > cz))
          .mapToInt(c -> count[c -ca] += 1) 
          .toArray() )
        .toArray();
      
      IntStream.range(0, count.length)
        .forEach(i -> System.out.println(Character.valueOf((char)(ca + (char)i)).toString() + " : " + count[i]));
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      String[] lines;
      double[] s;
      while( !(line = br.readLine()).equals("0") ){

        int n = Integer.parseInt(line);
        lines = br.readLine().split(" ");

        s =
          Stream.of(lines)
            .mapToDouble(Double::parseDouble)
            .toArray();
        
        double dm =
          Arrays.stream(s)
            .average()
          .getAsDouble();

        double result =
        Arrays.stream(s)
          .parallel()
          .map(d -> Math.pow((d-dm),2) / n)
          .sum();

        System.out.printf("%.8f\n" , Math.sqrt(result));
      }
    }
  }
}

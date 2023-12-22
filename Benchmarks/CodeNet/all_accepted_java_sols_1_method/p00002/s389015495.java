import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      String[] digit;
      int sum;
      String buf;
      StringBuilder result = new StringBuilder();
      while(true) {

        if( (line = br.readLine()) == null || line.isEmpty() ) break;

        digit = line.split(" ");
        sum = Integer.parseInt( digit[0] ) + Integer.parseInt( digit[1] );
        buf = String.valueOf(sum);
        result.append(buf.length()).append("\n");
      }

      System.out.print(result);
    }
  }
}

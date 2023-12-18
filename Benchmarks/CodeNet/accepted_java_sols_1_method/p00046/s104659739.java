import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Float f = Float.parseFloat(br.readLine());
    float high = f, low = f;
    String line;
    while( ( line = br.readLine() ) != null ) {
      f = Float.parseFloat(line);
      if ( f > high ) {
        high = f;
      } else if ( f < low) {
        low = f;
      }
    }
    System.out.println( high - low );
  }
}
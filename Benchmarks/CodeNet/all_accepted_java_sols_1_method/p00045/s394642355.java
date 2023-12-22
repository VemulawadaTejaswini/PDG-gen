import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input;
    int x = 0;
    float y = 0;
    int s = 0;
    int c = 0;
    while((input = br.readLine()) != null){
      String[] inputArray = input.trim().split(",");
      int a = Integer.parseInt(inputArray[0]);
      float b = Float.parseFloat(inputArray[1]);
      x += a * b;
      y += b;
      c++;
    }
    int avg = (int)Math.round( y / c );
    System.out.println(x + "\n" +avg);
  }
}
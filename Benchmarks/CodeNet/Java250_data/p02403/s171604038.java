import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readValue;
    while ((readValue = reader.readLine()) != null) {
      int h = Integer.parseInt(readValue.split(" ")[0]);
      int w = Integer.parseInt(readValue.split(" ")[1]);
      if (h == 0 && w == 0)
        break;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          System.out.print("#");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

}
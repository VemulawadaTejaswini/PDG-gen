
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String readStr;
    while ((readStr = reader.readLine()) != null) {
      String[] formattedStrs = readStr.split(" ");
      int left = Integer.parseInt(formattedStrs[0]);
      int right = Integer.parseInt(formattedStrs[1]);

      int weight = 1;
      int count = 1;
      while (true) {
        int surplus = (left + right) / weight;
        if (surplus < 10) {
          System.out.println(count);
          break;
        }
        weight *= 10;
        count++;
      }

    }
  }

}
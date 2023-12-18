import static java.lang.Math.pow;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int numOfDataset = Integer.parseInt(reader.readLine());
    for (int i = 0; i < numOfDataset; i++) {
      String[] sideLengths_Str = reader.readLine().split(" ");
      int[] sideLengths = new int[sideLengths_Str.length];
      for (int j = 0; j < sideLengths_Str.length; j++)
        sideLengths[j] = Integer.parseInt(sideLengths_Str[j]);

      Arrays.sort(sideLengths);

      if (pow(sideLengths[2], 2)
              == pow(sideLengths[1], 2) + pow(sideLengths[0], 2)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}
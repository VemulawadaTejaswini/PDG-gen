import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int H = 0;
    int W = 0;

    int h = 0;
    int w = 0;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final String[] HW = br.readLine().split("\\s");
      H = Integer.parseInt(HW[0]);
      W = Integer.parseInt(HW[1]);

      final String[] hw = br.readLine().split("\\s");
      h = Integer.parseInt(hw[0]);
      w = Integer.parseInt(hw[1]);

    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    System.out.print((H * W + h * w) - (h * W + H * w));
  }
}



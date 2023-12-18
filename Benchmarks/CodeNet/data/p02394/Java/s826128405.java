import java.io.*;
import java.util.Arrays;
   
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int w = Integer.parseInt(inputs[0]), h = Integer.parseInt(inputs[1]);
    int x = Integer.parseInt(inputs[2]), y = Integer.parseInt(inputs[3]), r = Integer.parseInt(inputs[4]);

    if (x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
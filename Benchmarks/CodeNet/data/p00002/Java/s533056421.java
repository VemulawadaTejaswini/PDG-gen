import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    try {
      while (input.ready()) {
        String[] dataset = input.readLine().split(" ");
        int sum = Integer.valueOf(dataset[0]) + Integer.valueOf(dataset[1]);
        System.out.println(sum /10 +1);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws java.io.IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final String input = reader.readLine();
      System.out.println(input.contains("2") ? "No" : "Yes");
    }
  }

}

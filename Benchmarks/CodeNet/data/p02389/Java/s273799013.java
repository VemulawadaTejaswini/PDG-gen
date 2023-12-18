import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final String numbers = reader.readLine().split(" ");
      final int resVal = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
      System.out.println(resVal);
    }
  }
}
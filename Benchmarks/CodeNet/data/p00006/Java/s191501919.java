import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String revStr = "";
    while (input.ready()) {
      char[] str = input.readLine().toCharArray();
      for (char ch : str) {
        revStr = ch + revStr;
      }
      System.out.println(revStr);
    }
  }

}
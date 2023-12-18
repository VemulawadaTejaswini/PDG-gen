import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String revStr = "";
    while (input.ready()) {
      String[] str = input.readLine().split("");
      for (int i = str.length-1; i <= 0; i-- ) {
        revStr = revStr + str[i];
      }
      System.out.println(revStr);
    }
  }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    int c = 0;
    while ((readStr = reader.readLine()) != null) {
      int readInt = Integer.parseInt(readStr);
      if (readInt == 0) break;
      System.out.println("Case " + ++c + ": " + readInt);
    }
  }

}
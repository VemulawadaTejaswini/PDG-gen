import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    int c = 0;
    while ((readStr = reader.readLine()) != null) {
      int[] list = new int[3];
      list[0] = Integer.parseInt(readStr.split(" ")[0]);
      list[1] = Integer.parseInt(readStr.split(" ")[1]);
      list[2] = Integer.parseInt(readStr.split(" ")[2]);
      for (int i = list[0]; i <= list[1]; i++) {
        if (list[2] % i == 0) c++;
      }
      System.out.println(c);
      break;
    }
  }

}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // クラス名はMain
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < s.length() - 2; i++) {
      int tmp = Math.abs(753 - Integer.parseInt(s.substring(i,  i + 3)));
      if (tmp < min) {
        min = tmp;
      }
    }
    System.out.println(min);
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int aButton = Integer.parseInt(str[0]);
    int bButton = Integer.parseInt(str[1]);
    int sum = 0;
    
    for (int i = 0; i < 2; i++) {
      if (aButton > bButton) {
        sum += aButton;
        aButton--;
      } else {
        sum += bButton;
        bButton--;
      }
    }
    System.out.println(sum);
  }
}
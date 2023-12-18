import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


  public static void main(String[] args) {

    char[] s = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      s = br.readLine().toCharArray();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    char[] odd = new char[2];
    odd[0] = s[0];
    odd[1] = (odd[0] == '0') ? '1' : '0';

    int sum = 0;
    for (int i = 1; i < s.length; i++) {
      if ((i + 1) % 2 != 0) {
        sum = (s[i] != odd[0]) ? sum + 1 : sum;
      } else if ((i + 1) % 2 == 0) {
        sum = (s[i] != odd[1]) ? sum + 1 : sum;
      }
    }
    System.out.print(sum);
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int n = 0;
    String[] lineOne = null;
    String[] lineTwo = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      n = Integer.parseInt(br.readLine());
      lineOne = br.readLine().split("\\s");
      lineTwo = br.readLine().split("\\s");
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int max = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j <= i; j++) {
        sum += Integer.parseInt(lineOne[j]);
      }
      sum += Integer.parseInt(lineTwo[i]);
      for (int l = i + 1; l <= n - 1; l++) {
        sum += Integer.parseInt(lineTwo[l]);
      }
      max = Math.max(max, sum);
    }
    System.out.print(max);
  }
}

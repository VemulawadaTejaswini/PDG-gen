import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iNum = Integer.parseInt(br.readLine());
    int sum = 0, n = 1;
    if (iNum % 2 == 0) {
      sum += iNum / 2;
      n = 2;
    }
    for (int i = iNum - n; i > 0; i -= 2) {
      sum += i;
    }
    System.out.println(sum);
  }
}
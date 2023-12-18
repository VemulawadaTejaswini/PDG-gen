
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    int[] numPatternCount = new int[19];
    int i, j, k, l;
    int size = 9;
    int sum;
    i:for (i = 0; i <= size; i++) {
      j:for (j = 0; j <= size; j++) {
        k:for (k = 0; k <= size; k++) {
          if (i + j + k > 18)
            continue j;
          l:for (l = 0; l <= size; l++) {
            sum = i + j + k + l;
            if (sum > 18)
              continue k;
            numPatternCount[sum]++;
          }
        }
      }
    }

    while ((readStr = reader.readLine()) != null) {
      int n = Integer.parseInt(readStr);
      System.out.println(
              n > 36 ? 0
              : numPatternCount[n > 18 ? numPatternCount.length - (n - numPatternCount.length) - 2 : n]
      );
    }
  }

}

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
    int c = 0;
    int i_j;
    int i_j_k;
    int i_j_k_l;
    for (i = 0; i <= size; i++) {
      for (j = 0; j <= size; j++) {
        i_j = i + j;
        if (i_j > 18)
          break;
        for (k = 0; k <= size; k++) {
          i_j_k = i_j + k;
          if (i_j_k > 18)
            break;
          for (l = 0; l <= size; l++) {
            i_j_k_l = i_j_k + l;
            if (i_j_k_l > 18)
              break;
            numPatternCount[i_j_k_l]++;
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
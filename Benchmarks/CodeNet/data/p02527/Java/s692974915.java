import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      String line_1 = buf.readLine();
      int n = Integer.parseInt(line_1);
      int[] scores = new int[n];
      String[] line_2 = buf.readLine().split(" ");
      for(int i=0; i<n; i++){
        scores[i] = Integer.parseInt(line_2[i]);
      }
      Arrays.sort(scores);

      StringBuilder t = new StringBuilder();
             t.append(scores[0]);
             for(int j = 1;j < n;j++) {
                 t.append(" " + scores[j]);
             }
             System.out.println(t);
    }
  }
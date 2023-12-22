import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main (String[] args) {
    String[] nq = new String[2];
    char[] s = null;
    List<String[]> lr = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      nq = br.readLine().split("\\s");
      s = br.readLine().toCharArray();
      for (int i = 0; i < Integer.parseInt(nq[1]); i++) {
        lr.add(br.readLine().split("\\s"));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int[] sum = new int[s.length + 1];
    for (int i = 1; i < s.length; i++) {
      if (s[i-1] == 'A' && s[i] == 'C') {
        sum[i+1] = sum[i] + 1;
      } else {
        sum[i+1] = sum[i];
      }
    }

    for (String[] array : lr) {
      final int start = Integer.parseInt(array[0]);
      final int end = Integer.parseInt(array[1]);
      System.out.println(sum[end] - sum[start]);
    }
  }
}

import java.io.*;
import java.util.*;

// main

public class Main {
  private static final int MAX_N = 10000;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    while (true) {
      int n = Integer.parseInt(br.readLine().trim());
      if (n == 0) break;

      int hn = (n - 1) / 2;

      int[] sqcheck = new int[n];
      Arrays.fill(sqcheck, 0);

      for (int i = 1; i <= n; i++)
        sqcheck[(i * i) % n] = 1;

      int sqsize = 0;
      int[] sqs = new int[n];
      for (int i = 1; i < n; i++)
        if (sqcheck[i] > 0) sqs[sqsize++] = i;

      int[] counts = new int[hn + 1];
      Arrays.fill(counts, 0);

      for (int i = 0; i < sqsize; i++)
        for (int j = 0; j < sqsize; j++)
          if (i != j) {
            int d = sqs[i] - sqs[j];
            if (d < 0) d += n;
            if (d > hn) d = n - d;
            counts[d]++;
          }

      for (int i = 1; i <= hn; i++)
        System.out.println(counts[i]);
    }
  }
}
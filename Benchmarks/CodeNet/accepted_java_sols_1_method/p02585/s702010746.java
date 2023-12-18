import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    String[] p_line = br.readLine().split(" ");
    String[] c_line = br.readLine().split(" ");
    br.close();
    int n = Integer.parseInt(head[0]);
    int k = Integer.parseInt(head[1]);

    int[] p = new int[n];
    long[] c = new long[n];
    for (int i = 0; i < n; i++) {
      p[i] = Integer.parseInt(p_line[i]) - 1;
    }
    for (int i = 0; i < n; i++) {
      c[i] = Long.parseLong(c_line[i]);
    }
    long answer = Long.MIN_VALUE;
    long[] c_total = new long[n];
    boolean[] isVisit = new boolean[n];
    Arrays.fill(isVisit, false);
    for (int i = 0; i < n; i++) {
      int idx = i;
      int size = 0;
      if (isVisit[idx] == true) {
        continue;
      } else {
        size = 0;
        while (true) {
          if (isVisit[idx] == true) {
            break;
          }
          c_total[size] = c[p[idx]];
          if (size != 0) {
            c_total[size] += c_total[size - 1];
          }
          isVisit[idx] = true;
          idx = p[idx];
          size++;
        }

        if(c_total[size - 1] > 0) {
          answer = Math.max(answer, c_total[size - 1] * (k / size));
        }
        
        for (int start = 0; start < size; start++) {
          for (int count = 1; count < size; count++) {
            long val;
            if (count > k) {
              continue;
            }
            int to = (start + count - 1) % size;
            if (start <= to) {
              val = c_total[to];
              if (start != 0) {
                val -= c_total[start - 1];
              }
            } else {
              val = c_total[size - 1] - c_total[start - 1] + c_total[to];
            }
            if (c_total[size - 1] > 0) {
              val += (c_total[size - 1] * ((k - count) / size));
            }
            answer = Long.max(answer, val);
          }
        }
      }
    }
    System.out.println(answer);
  }
}
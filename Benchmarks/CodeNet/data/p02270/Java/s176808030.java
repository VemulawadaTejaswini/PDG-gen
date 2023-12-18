import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    
      String[] line = br.readLine().split(" ");
      int n = Integer.parseInt(line[0]);
      int unit = Integer.parseInt(line[1]);
      long[] loads = new long[n];
      for(int i=0; i<n; i++)
        loads[i] = Long.parseLong(br.readLine());

      long left = 0;
      long right= 10_000 * n / unit;
      long mid;
      while(right - left > 1) {
        mid = (left+right) / 2;
        int v = calcNumOfLoads(unit, mid, loads);
        if(v>=n) right = mid;
        else left = mid;
      }
      long result = right;

      System.out.println(result);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }
  private int calcNumOfLoads(int unit, long maxLoad, long[] loads) {
    int i=0;
    int tail=loads.length;
    long s;

    for(int j=0; j<unit; j++) {
      s=0;
      while(s+loads[i] <= maxLoad) {
        s += loads[i++];
        if(i == tail) return tail;
      }
    }

    return i;
  }
}

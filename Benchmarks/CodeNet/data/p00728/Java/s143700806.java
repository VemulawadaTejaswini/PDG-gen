import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      StringBuilder buf = new StringBuilder();
      while(true) {
        int n = Integer.parseInt(in.readLine());

        if(n == 0) break;

        int[] p = new int[n];
        int min = 100_000_000;
        int max = 0;
        for(int i=0; i<n; i++) {
          p[i] = Integer.parseInt(in.readLine());
          if(min > p[i]) min = p[i];
          if(max < p[i]) max = p[i];
        }

        int ans=0;
        boolean isExcutedMin = false;
        boolean isExcutedMax = false;
        for (int i : p) {
          if(!isExcutedMax && i == max) {
            isExcutedMax = true;
            continue;
          }
          if(!isExcutedMin && i == min) {
            isExcutedMin = true;
            continue;
          }

          ans += i;
        }
        ans /= (n-2);

        buf.append(ans).append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}

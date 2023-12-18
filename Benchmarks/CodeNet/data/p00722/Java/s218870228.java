import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      final int MAX = 1_000_000;
      boolean[] isPrime = new boolean[MAX];
  
      Arrays.fill(isPrime,true);
      isPrime[0] = isPrime[1] = false;
  
      for ( int i=2; i < MAX; i++ ) {
        if (isPrime[i]) {
          for (int j = i<<1; j < MAX; j += i) {
            isPrime[j] = false;
          }
        }
      }

      StringBuilder buf = new StringBuilder();
      String[] lines;
      while(true) {
        lines = in.readLine().split(" ");
        int a = Integer.parseInt(lines[0]);
        int d = Integer.parseInt(lines[1]);
        int n = Integer.parseInt(lines[2]);

        if(a == 0 && d == 0 && n == 0) break;

        int prime;
        for(int p=a, i=0; ; p+=d) {
          if(isPrime[p]) {
            i++;
            if(i == n) {
              prime = p;
              break;
            }
          }
        }
        buf.append(prime).append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}

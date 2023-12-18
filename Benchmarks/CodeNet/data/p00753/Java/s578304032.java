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

      final int MAX = 123456<<1 + 1;
      boolean[] isPrime = new boolean[MAX];
      int[] primes = new int[MAX];
  
      Arrays.fill(isPrime,true);
      isPrime[0] = isPrime[1] = false;
  
      for ( int i=2, p=0; i < MAX; i++ ) {
        if (isPrime[i]) {
          p++;
          for (int j = i<<1; j < MAX; j += i) {
            isPrime[j] = false;
          }
        }
        primes[i] = p;
      }

      StringBuilder buf = new StringBuilder();
      while(true) {
        int n = Integer.parseInt(in.readLine());

        if(n == 0) break;

        int ans = primes[n<<1] - primes[n];
        buf.append(ans).append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}

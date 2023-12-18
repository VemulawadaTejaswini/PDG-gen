
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    int H = scan.nextInt();
    int W = scan.nextInt();
    int K = scan.nextInt();

    int c[] = new int[H*W];
    int blacks = 0;
    for(int i = 0; i < H; i++) {
      String S = scan.next();
      for(int j = 0; j < W; j++) {
        if(S.charAt(j) == '.')
          c[i*W+j] = 0;
        else {
          c[i * W + j] = 1;
          blacks++;
        }
      }
    }
    int ans = 0;
    int allH = (int)Math.pow(2.0, H);
    int allW = (int)Math.pow(2.0, W);

    for(int i = 0; i < allH; i++) {
      for(int j = 0; j < allW; j++) {
        Set<Integer> set = new HashSet<>();
        for(int k = 0; k < H; k++) {
          if(((i >> k) & 1) == 1){
            for(int t = k*W; t < k*W+W; t++) {
              if(c[t] == 1)
                set.add(t);
            }
          }
        }
        for(int k = 0; k < W; k++) {
          if(((j >> k) & 1) == 1){
            for(int t = 0; t < H; t++) {
              if(c[k+W*t] == 1)
                set.add(k+W*t);
            }
          }
        }
        if(blacks-set.size() == K)
          ans++;
      }
    }

    os.println(ans);
  }
}

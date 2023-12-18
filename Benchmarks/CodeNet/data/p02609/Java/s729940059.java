import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int n;
  static long ans;
  static int[] dp;
  static int[] op;
  static String x;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    x = br.readLine();

    br.close();

    op = new int[n+1];

    dp = new int[200001];

    dp[0] = 0;

    for (int i = 1; i <= 200000; i++) {
      dp[i] = dp[i % Integer.bitCount(i)] + 1;
    }

    int initBit = 0;

    for (int i = 0; i < n; i++) {
      if (x.charAt(i) == '1') {
        initBit++;
      }
    }

    int u = 0, l = 0;

    for (int i = n-1; i >= 0; i--) {
      u = 2 * u + (x.charAt(i) - '0');
      l = 2 * l + (x.charAt(i) - '0');
      u %= initBit+1;
      if(initBit > 1){
        l %= initBit-1;
      }
    }

    int adu = 1%(initBit+1), adl = 0;
    if (initBit > 1) adl = 1 % (initBit-1);

    for (int i = n-1; i >= 0; i--) {

      if (x.charAt(i) == '0') {
        op[i] = dp[(u + adu) % (initBit + 1)] + 1;
      } else {
        if (initBit > 1) {
          op[i] = dp[(l - adl + initBit - 1) % (initBit - 1)] + 1;
        } else {
          op[i] = 0;
        }
      }

      adu = (adu * 2) % (initBit + 1);
      if(initBit > 1) adl = (adl * 2) % (initBit - 1);

    }

    for (int i = 0; i < n; i++) {
      out.println(op[i]);
    }

    out.flush();
  }
}
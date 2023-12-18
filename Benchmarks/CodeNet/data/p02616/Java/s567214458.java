import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MyMod {

  static final long MOD = 1000000007;
  public long val;

  MyMod(long val){
    this.val = val;
  }

  MyMod(){
    this(0L);
  }

  public static long add(long a, long b){
    return (a%MOD + b%MOD) % MOD;
  }

  public static long sub(long a, long b){
    return ((a%MOD - b%MOD) + MOD) % MOD;
  }

  public static long mul(long a, long b){
    return (a%MOD * b%MOD) % MOD;
  }

  public static long div(long a, long b){
    return (a%MOD * pow(b, MOD-2)%MOD) % MOD;
  }

  // calc a^b
  public static long pow(long a, long b){
    long result = 1L;
    a%=MOD;
    while(b > 0){
      if(b % 2 == 1) result = (result * a) % MOD;
      a = (a * a) % MOD;
      b = (b>>1);
    }
    return result;
  }

  // calc inverse element
  public static long invEle(long a){
    return pow(a%MOD, MOD-2) % MOD;
  }

  public void add(long a){
    val = add(val, a);
  }

  public void sub(long a){
    val = sub(val, a);
  }

  public void mul(long a){
    val = mul(val, a);
  }

  public void div(long a){
    val = div(val, a);
  }
}

public class Main {

  static final long MOD = 1000000007;

  static int n, k;
  static long ans, minusCount, plusCount;
  static List<Long> a, plus, minus;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Integer.parseInt(in[1]);

    in = br.readLine().split(" ");
    a =
        Arrays.stream(in)
            .map(Long::parseLong)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

    br.close();

    minusCount = a.stream().filter(t -> t < 0).count();
    plusCount = n - minusCount;

    ans = 1;

    if (n == k) {
      a.forEach(
          t -> {
            ans = MyMod.mul(ans, t);
          });
    } else if (minusCount == (long) n) {
      if (k % 2 == 0) {
        for (int i = 0; i < k; i++) {
          ans = MyMod.mul(ans, a.get(n - i - 1));
        }
      } else {
        for (int i = 0; i < k; i++) {
          ans = MyMod.mul(ans, a.get(i));
        }
      }
    } else {

      int csr = 0;
      plus = new ArrayList<>();
      minus = new ArrayList<>();
      while (csr < n && a.get(csr) >= 0) {
        plus.add(a.get(csr++));
      }
      csr = n - 1;
      while (csr > 0 && a.get(csr) < 0) {
        minus.add(-a.get(csr--));
      }

      int p = 0, m = 0;

      for (int i = 0; i < k; i++) {
        if (m >= minusCount || (p < plusCount && (plus.get(p) > minus.get(m)))) {
          ans = MyMod.mul(ans, plus.get(p++));
        } else {
          ans = MyMod.mul(ans, minus.get(m++));
        }
      }

      if (m % 2 == 1 && ans != 0) {
        long ans1 = -MOD, ans2 = -MOD;

        if (p < plusCount && m > 0 && m < minusCount && p > 0) {
          if (plus.get(p - 1) * plus.get(p) <= minus.get(m - 1) * minus.get(m)) {
            ans = MyMod.mul(ans, minus.get(m));
            ans = MyMod.div(ans, plus.get(p-1));
          }else{
            ans = MyMod.mul(ans, plus.get(p));
            ans = MyMod.div(ans, minus.get(m-1));
          }
        } else {
          if (p < plusCount && m > 0) {
            ans1 = MyMod.mul(ans, plus.get(p));
            ans1 = MyMod.div(ans1, minus.get(m - 1));
          }

          if (m < minusCount && p > 0) {
            ans2 = MyMod.mul(ans, minus.get(m));
            ans2 = MyMod.div(ans2, plus.get(p-1));
          }
  
          ans = Math.max(ans1, ans2);
          }
      }
    }

    out.println((ans % MOD + MOD) % MOD);

    out.flush();
  }
}
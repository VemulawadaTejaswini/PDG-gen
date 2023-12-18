import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    List<Integer> natural = new ArrayList<>();
    List<Integer> negative = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      if (a >= 0) {
        natural.add(a);
      } else {
        negative.add(a);
      }
    }
    int mod = 1000000000 + 7;
    if (n == k) {
      ModInt ans = new ModInt(1, mod);
      for (Integer i : Stream.of(natural, negative)
        .flatMap(List::stream)
        .collect(Collectors.toList())) {
        ans = ans.multiplicity(i);
      }
      pw.println(ans);
      return;
    }
    Collections.sort(natural);
    Collections.reverse(natural);
    Collections.sort(negative);
    if (natural.isEmpty() && k % 2 == 1) {
      Collections.reverse(negative);
      ModInt ans = new ModInt(1, mod);
      for (int i = 0; i < k; i++) {
        ans = ans.multiplicity(negative.get(i));
      }
      pw.println(ans);
      return;
    }
    List<Integer> values = new ArrayList<>();
    int naturalIndex = 0;
    int negativeIndex = 0;
    while (values.size() < k) {
      if (k - values.size() == 1) {
        values.add(natural.get(naturalIndex));
        naturalIndex++;
      } else {
        if (naturalIndex < natural.size() - 1 && negativeIndex < negative.size() - 1) {
          long mNatural = (long) natural.get(naturalIndex) * natural.get(naturalIndex + 1);
          long mNegative = (long) negative.get(negativeIndex) * negative.get(negativeIndex + 1);
          if (mNatural >= mNegative) {
            values.add(natural.get(naturalIndex));
            naturalIndex++;
          } else {
            values.add(negative.get(negativeIndex));
            negativeIndex++;
            values.add(negative.get(negativeIndex));
            negativeIndex++;
          }
          continue;
        }
        if (naturalIndex < natural.size() - 1) {
          values.add(natural.get(naturalIndex));
          naturalIndex++;
        } else {
          values.add(negative.get(negativeIndex));
          negativeIndex++;
          values.add(negative.get(negativeIndex));
          negativeIndex++;
        }
      }
    }
    ModInt ans = new ModInt(1, mod);
    for (Integer v : values) {
      ans = ans.multiplicity(v);
    }
    pw.println(ans);
  }

  static class ModInt {

    final long mod;
    long x;

    ModInt(long x, long mod) {
      this.x = x;
      this.mod = mod;
    }

    ModInt(ModInt m) {
      this.x = m.x;
      this.mod = m.mod;
    }

    ModInt add(long m) {
      ModInt n = new ModInt(this);
      n.x += m;
      n.x %= mod;
      return n;
    }

    ModInt add(ModInt m) {
      return this.add(m.x);
    }

    ModInt minus(long m) {
      ModInt n = new ModInt(this);
      if ((n.x += (mod - m)) >= mod) {
        n.x -= mod;
      }
      return n;
    }

    ModInt minus(ModInt m) {
      return this.minus(m.x);
    }

    ModInt multiplicity(long m) {
      ModInt n = new ModInt(this);
      n.x *= m;
      n.x %= mod;
      return n;
    }

    ModInt multiplicity(ModInt m) {
      return multiplicity(m.x);
    }

    ModInt pow(long p) {
      if (p == 0) {
        return new ModInt(1, mod);
      }
      ModInt a = pow(p >> 1);
      a = a.multiplicity(a.x);
      if ((p & 1) == 1) {
        a = a.multiplicity(x);
      }
      return a;
    }

    ModInt inv() {
      return pow(mod - 2);
    }

    ModInt divide(ModInt d) {
      ModInt n = new ModInt(this);
      n = n.multiplicity(d.inv().x);
      return n;
    }

    @Override
    public String toString() {
      if (x >= 0) {
        return String.valueOf(x);
      } else {
        return String.valueOf(mod + x);
      }
    }
  }
}

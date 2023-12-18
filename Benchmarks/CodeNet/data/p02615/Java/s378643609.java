import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    int[] descendingOrder = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    for (int i = 0; i < n; i++) {
      descendingOrder[i] = a[n - i - 1];
    }
    if (n == 2) {
      pw.println(descendingOrder[0]);
      return;
    }
    SortedSet<Pair> pairs = new TreeSet<>(
      Comparator
        .comparingInt(Pair::min)
        .thenComparingInt(p -> p.a)
        .thenComparingInt(p -> p.b)
        .reversed()
        .thenComparingInt(p -> p.id)
    );
    long ans = 0;
    Pair.resetCount();
    Pair first = new Pair(descendingOrder[0], descendingOrder[1]);
    pairs.add(first);
    pairs.add(new Pair(first));
    ans += descendingOrder[0];
    for (int i = 2; i < n; i++) {
      Iterator<Pair> targetIterator = pairs.iterator();
      Pair target = targetIterator.next();
      targetIterator.remove();
      ans += target.min();
      Pair[] split = target.split(descendingOrder[i]);
      pairs.add(split[0]);
      pairs.add(split[1]);
    }
    pw.println(ans);
  }

  static class Pair {

    static AtomicInteger counter = new AtomicInteger(0);

    int id = counter.getAndIncrement();

    int a;
    int b;

    public Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public Pair(Pair copy) {
      this(copy.a, copy.b);
    }

    int min() {
      return Math.min(a, b);
    }

    public Pair[] split(int c) {
      return new Pair[]{
        new Pair(a, c),
        new Pair(b, c)
      };
    }

    @Override
    public String toString() {
      return "Pair{" +
        "id=" + id +
        ", a=" + a +
        ", b=" + b +
        '}';
    }

    static void resetCount() {
      counter.set(0);
    }
  }
}

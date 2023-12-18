import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    Integer p[] = new Integer[n + 1];
    Integer c[] = new Integer[n + 1];
    for (int i = 1; i < n + 1; i++) {
      p[i] = Integer.parseInt(sc.next());
    }
    for (int i = 1; i < n + 1; i++) {
      c[i] = Integer.parseInt(sc.next());
    }
    List<NumberChain> chains = new ArrayList<>();
    Predicate<Integer> alreadyVisited = i -> chains
      .stream()
      .anyMatch(chain -> chain.visited(i));
    for (int i = 1; i < n; i++) {
      NumberChain chain = new NumberChain();
      Integer nextP = p[i];
      while (!alreadyVisited.test(nextP) && !chain.visited(nextP)) {
        Integer cp = c[nextP];
        chain.addNext(nextP, cp);
        nextP = p[nextP];
      }
      if (!chain.isEmpty()) {
        chains.add(chain);
      }
    }
    chains.forEach(NumberChain::calculate);
    pw.println(
      chains.stream().mapToLong(chain -> chain.getMaxValue(k)).max().getAsLong()
    );
  }

  static class MaxValue {

    long max = Long.MIN_VALUE;

    public MaxValue(long max) {
      this.max = max;
    }

    void update(long newMax) {
      max = Math.max(max, newMax);
    }
  }

  static class NumberChain {

    Set<Integer> visitedPSet = new HashSet<>();
    List<Integer> cList = new ArrayList<>();
    Map<Integer, MaxValue> countToMax;
    long total = 0;

    void addNext(Integer p, Integer c) {
      if (visitedPSet.contains(p)) {
        throw new IllegalArgumentException(String.valueOf(p));
      }
      visitedPSet.add(p);
      cList.add(c);
    }

    boolean visited(Integer p) {
      return visitedPSet.contains(p);
    }

    boolean isEmpty() {
      return visitedPSet.isEmpty();
    }

    void calculate() {
      countToMax = new HashMap<>();
      for (int i = 0; i < cList.size(); i++) {
        long current = 0;
        int count = 1;
        for (int j = i; count <= cList.size(); count++, j++) {
          Integer c = cList.get(j % cList.size());
          current += c;
          final long finalCurernt = current;
          countToMax
            .computeIfAbsent(count, key -> new MaxValue(finalCurernt))
            .update(current);
        }
        total = current;
      }
    }

    long getMaxValue(int k) {
      if (k == 0) {
        return 0L;
      }
      int loop = k / cList.size();
      int remainK = k % cList.size();
      if (remainK == 0) {
        loop--;
        remainK = k;
      }
      final long fRemainK = remainK;
      if (total < 0) {
        return countToMax.entrySet()
          .stream()
          .filter(e -> e.getKey() <= fRemainK)
          .mapToLong(e -> e.getValue().max)
          .max().getAsLong();
      }
      return total * loop + countToMax.entrySet()
        .stream()
        .filter(e -> e.getKey() <= fRemainK)
        .mapToLong(e -> e.getValue().max)
        .max().getAsLong();
    }
  }
}

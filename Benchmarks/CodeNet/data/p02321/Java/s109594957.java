

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  private static class Solver1 {
    private long solve(long W, List<Long> values, List<Long> weights) {
      List<Long[]> vw1 = new ArrayList<>();
      List<Long[]> vw2 = new ArrayList<>();
      for (int i = 0; i < values.size(); ++i) {
        long v = values.get(i);
        long w = weights.get(i);
        if (i < values.size() / 2) {
          vw1.add(new Long[] {v,w});
        } else {
          vw2.add(new Long[] {v,w});
        }
      }
      List<Long[]> svw1 = new ArrayList<>();
      List<Long[]> svw2 = new ArrayList<>();
      dfs(vw1, 0, 0, svw1);
      dfs(vw2, 0, 0, svw2);
      sortAndRemove(svw1);
      sortAndRemove(svw2);
      long res = Math.max(svw1.get(svw1.size() - 1)[0], svw2.get(svw2.size() - 1)[0]);
      for (Long[] ele : svw1) {
        long v = ele[0];
        long w = ele[1];
        long targetW = W - w;
        int i = Collections.binarySearch(svw2, new Long[] {null, targetW}, Comparator.comparingLong(i1 -> i1[1]));
        if (i < 0) {
          i = -i -1;
          i = i - 1;
        }
        if (i < 0) {
          continue;
        }
        res = Math.max(res, v + svw2.get(i)[0]);
      }
      return res;
    }

    private void dfs(List<Long[]> vw, long sv, long sw, List<Long[]> res) {
      if (vw.isEmpty()) {
        res.add(new Long[] {sv, sw});
        return;
      }
      long v = vw.get(0)[0];
      long w = vw.get(0)[1];
      dfs(vw.subList(1, vw.size()), sv + v, sw + w, res);
      dfs(vw.subList(1, vw.size()), sv, sw, res);
    }

    private void sortAndRemove(List<Long[]> svw) {
      Collections.sort(svw, (i1, i2) -> {
        long v1 = i1[0];
        long w1 = i1[1];
        long v2 = i2[0];
        long w2 = i2[1];
        if (w1 == w2) {
          return Long.compare(v1, v2);
        } else {
          return Long.compare(w1, w2);
        }
      });
      List<Long[]> newsvw = new ArrayList<>();
      newsvw.add(svw.get(0));
      for (int i = 1; i < svw.size(); ++i) {
        long v1 = svw.get(i)[0];
        long vp = svw.get(i - 1)[0];
        if (v1 <= vp) {
          continue;
        }
        newsvw.add(svw.get(i));
      }
      svw.clear();
      svw.addAll(newsvw);
    }
  }

  private static class Solver2 {
    private static class VW implements Comparable<VW> {
      private final long v;
      private final long w;
      private VW(long v, long w) {
        this.v = v;
        this.w = w;
      }
      @Override
      public int compareTo(VW o) {
        return Long.compare(w, o.w);
      }
    }

    private long solve(long W, List<Long> values, List<Long> weights) {
      List<VW> vws = new ArrayList<>();
      for (int i = 0; i < values.size(); ++i) {
        vws.add(new VW(values.get(i), weights.get(i)));
      }
      Collections.sort(vws, Collections.reverseOrder());
      List<VW> svws = new ArrayList<>();
      svws.add(vws.get(0));
      for (int i = 1; i < vws.size(); ++i) {
        VW vw = vws.get(i);
        VW svw = svws.get(i - 1);
        svws.add(new VW(vw.v + svw.v, vw.w + svw.w));
      }
      long[] res = {0};
      dfs(W, svws, 0, res);
      return res[0];
    }

    private void dfs(long W, List<VW> svws, long sv, long[] res) {
      if (W <= 0 || svws.isEmpty()) {
        res[0] = Math.max(res[0], sv);
        return;
      }
      VW svw = svws.get(svws.size() - 1);
      if (W >= svw.w) {
        res[0] = Math.max(res[0], sv + svw.v);
        return;
      }
      long v = svw.v;
      long w = svw.w;
      if (svws.size() > 1) {
        v = v - svws.get(svws.size() - 2).v;
        w = w - svws.get(svws.size() - 2).w;
      }
      if (W - w < 0) {
        res[0] = Math.max(res[0], sv);
        return;
      }
      dfs(W - w, svws.subList(0, svws.size() - 1), sv + v, res);
      dfs(W, svws.subList(0, svws.size() - 1), sv, res);
    }
  }

  private static final Pattern SPLIT = Pattern.compile("\\s");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Long> weights = new ArrayList<>();
    List<Long> values = new ArrayList<>();
    List<Long> NW = Stream.of(SPLIT.split(scanner.nextLine())).map(Long::valueOf)
        .collect(Collectors.toList());
    final int N = (int) NW.get(0).longValue();
    final long W = NW.get(1);
    for (int i = 0; i < N; ++i) {
      List<Long> collect = Stream.of(SPLIT.split(scanner.nextLine())).map(Long::valueOf)
          .collect(Collectors.toList());
      values.add(collect.get(0));
      weights.add(collect.get(1));
    }
    System.out.println(new Solver1().solve(W, values, weights));
  }
}
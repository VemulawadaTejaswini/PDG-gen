

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {
  private static class Solver {
    public int solve(int W, List<Integer> values, List<Integer> weight) {
      int maxVal = values.stream().max(Integer::compare).get() * values.size();
      long[] dp = new long[maxVal + 1];
      Arrays.fill(dp, Long.MAX_VALUE);
      dp[0] = 0;
      for (int i = 1; i <= values.size(); ++i) {
        for (int j = maxVal; j >=0; --j) {
          int v = values.get(i - 1);
          int w = weight.get(i - 1);
          if (Long.MAX_VALUE != dp[j - v]) {
            dp[j] = Math.min(dp[j], dp[j - v] + w);
          }
        }
      }
      while (dp[maxVal] > W && maxVal > 0) {
        --maxVal;
      }
      return maxVal;
    }
  }

  private static final Pattern SPLIT = Pattern.compile("\\s");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> weights = new ArrayList<>();
    List<Integer> values = new ArrayList<>();
    List<Integer> NW = Stream.of(SPLIT.split(scanner.nextLine())).map(Integer::valueOf)
        .collect(Collectors.toList());
    final int N = NW.get(0);
    final int W = NW.get(1);
    for (int i = 0; i < N; ++i) {
      List<Integer> collect = Stream.of(SPLIT.split(scanner.nextLine())).map(Integer::valueOf)
          .collect(Collectors.toList());
      values.add(collect.get(0));
      weights.add(collect.get(1));
    }
    System.out.println(new Solver().solve(W, values, weights));
  }
}
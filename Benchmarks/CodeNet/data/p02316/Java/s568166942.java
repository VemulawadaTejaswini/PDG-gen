import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public int solve(int W, List<Integer> weights, List<Integer> values) {
        int N = values.size();
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= W; ++j) {
                int w = weights.get(i - 1);
                if (j >= w) {
                    dp[j] = Math.max(dp[j], dp[j - w] + values.get(i - 1));
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> weights = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        List<Integer> NW = Stream.of(scanner.nextLine().split("\\s")).map(Integer::valueOf)
                                      .collect(Collectors.toList());
        final int N = NW.get(0);
        final int W = NW.get(1);
        for (int i = 0; i < N; ++i) {
            List<Integer> collect = Stream.of(scanner.nextLine().split("\\s")).map(Integer::valueOf)
                                          .collect(Collectors.toList());
            values.add(collect.get(0));
            weights.add(collect.get(1));
        }
        System.out.println(new Main().solve(W, weights, values));
    }
}
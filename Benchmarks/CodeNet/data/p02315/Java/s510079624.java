import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
0-1 Knapsack Problem

You have N items that you want to put them into a knapsack. Item i has value vi and weight wi.

You want to find a subset of items to put such that:

The total value of the items is as large as possible.
The items have combined weight at most W, that is capacity of the knapsack.
Find the maximum total value of items in the knapsack.

Input
N W
v1 w1
v2 w2
:
vN wN
The first line consists of the integers N and W. In the following lines, the value and weight of the i-th item are given.

Output
Print the maximum total values of the items in a line.

Constraints
1 ??? N ??? 100
1 ??? vi ??? 1000
1 ??? wi ??? 1000
1 ??? W ??? 10000
Sample Input 1
4 5
4 2
5 2
2 1
8 3
Sample Output 1
13

Sample Input 2
2 20
5 9
4 10
Sample Output 2
9
*/

public class Main {
    public static class Solver {
        int solve(int W, List<Integer> values, List<Integer> weights) {
            int[] dp = new int[W + 1];
            for (int i = 1; i <= values.size(); ++i) {
                for (int j = W; j >= 0; --j) {
                    int v = values.get(i - 1);
                    int w = weights.get(i - 1);
                    if (j - w >= 0) {
                        dp[j] = Math.max(dp[j], dp[j - w] + v);
                    }
                }
            }
            return dp[W];
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
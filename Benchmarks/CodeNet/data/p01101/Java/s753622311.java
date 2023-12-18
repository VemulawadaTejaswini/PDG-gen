
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        boolean b = true;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (b) {
            b = runOnce(reader);
        }

        reader.close();
    }

    private boolean runOnce(final BufferedReader reader) throws IOException {
        final String[] params = reader.readLine().split(" ");
        final int count = Integer.parseInt(params[0]);
        final int max = Integer.parseInt(params[1]);
        if (count == 0 && max == 0) return false;
        final List<Integer> prices = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        int nextLow = 0;
        int maxSum = 0;
        for (int i = prices.size() - 1; i >= 0; i--) {
            int j;
            for (j = nextLow; j < i; j++) {
                if (prices.get(i) + prices.get(j) > max) {
                    break;
                }
            }
            if (j == nextLow) continue;
            maxSum = Math.max(maxSum, prices.get(i) + prices.get(j - 1));
            nextLow = j;
        }

        System.out.println(maxSum == 0 ? "NONE" : maxSum);
        return true;
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        MaximumProfit.solve();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);

        int[] r = new int[n];
        for (int index = 0; index < n; index++){
            line = scanner.nextLine();
            r[index] = Integer.parseInt(line);
        }

        int maxDiff = r[1] - r[0];
        int minR = r[0];
        for (int t = 1; t < n; t++) {
            int diff = r[t] - minR;
            maxDiff = max(maxDiff, diff);
            minR = min(minR, r[t]);
        }
        System.out.println(maxDiff);
    }

    private static int min(int x, int y) {
        return x < y ? x : y;
    }

    private static int max(int x, int y) {
        return x < y ? y : x;
    }
}


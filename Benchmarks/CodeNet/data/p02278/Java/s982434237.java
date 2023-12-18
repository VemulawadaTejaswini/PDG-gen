import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(minimumCost(a));
    }

    private static long minimumCost(int[] a) {
        int[] sorted = Arrays.copyOf(a, a.length);
        Arrays.sort(sorted);
        int[] indexes = new int[sorted[a.length-1]+1];
        for (int i = 0; i < a.length; i++) {
            indexes[sorted[i]] = i;
        }

        long cost = 0;
        for (int i = 0; i < a.length; i++) {
            int goalIndex = indexes[a[i]];
            if (goalIndex != i && goalIndex >= 0) {
                int cycleSize = 1;
                int cycleMin = a[i];
                int cycleSum = a[i];
                while (goalIndex != i) {
                    int nextInCycle = a[goalIndex];
                    cycleSize++;
                    if (nextInCycle < cycleMin) cycleMin = nextInCycle;
                    cycleSum += nextInCycle;
                    goalIndex = indexes[nextInCycle];
                    indexes[nextInCycle] = -1;
                }
                cost += Math.min(cycleSum + cycleMin * (cycleSize - 2),
                        cycleSum + cycleMin + sorted[0] * (cycleSize + 1));
            }
        }
        return cost;
    }
}


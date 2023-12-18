import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);

    int[] copyArray(int[] src) {
        int[] dst = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
        return dst;
    }

    List<Integer> traverse(int[] W, int[] sorted, boolean[] traversedIndices, int firstIdx, int idx) {
        traversedIndices[idx] = true;
        int x = W[idx];
        int nextIdx = -1;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == x) {
                nextIdx = i;
                break;
            }
        }
        if (nextIdx == -1) throw new Error();
        if (firstIdx == nextIdx) {
            List<Integer> li = new LinkedList<Integer>();
            li.add(idx);
            return li;
        } else {
            List<Integer> li = traverse(W, sorted, traversedIndices, firstIdx, nextIdx);
            li.add(idx);
            return li;
        }
    }
List<List<Integer>> findCycles(int[] W) {
        int[] copied = copyArray(W);
        Arrays.sort(copied);
        int[] sorted = copied;
        boolean[] traversedIndices = new boolean[W.length];
        List<List<Integer>> cycles = new LinkedList<List<Integer>>();
        for (int i = 0; i < W.length; i++) {
            if (traversedIndices[i]) continue;
            cycles.add(traverse(W, sorted, traversedIndices, i, i));
        }
        return cycles;
    }

    void printCycles(List<List<Integer>> cycles) {
        System.out.println("Cycles ---");
        for (List<Integer> li : cycles) {
            for (Integer x : li) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("--- Cycles");
    }

    int calcCycleCost(int[] W, List<Integer> cycle, int min) {
        int sum = 0;
        int minInACycle = Integer.MAX_VALUE;
        if (cycle.size() == 1) return 0;
        for (Integer val : cycle) {
            sum += W[val];
            minInACycle = Math.min(minInACycle, W[val]);
        }
        int a = sum + (cycle.size() - 2) * minInACycle;
        int b = sum + minInACycle + (cycle.size()+1) * min;
        return Math.min(a, b);
    }
int calcCost(int[] W, List<List<Integer>> cycles, int min) {
        int cost = 0;
        for (List<Integer> cycle : cycles) {
            int x = calcCycleCost(W, cycle, min);
            cost += x;
        }
        return cost;
    }

    void run() {
        int n = sc.nextInt();
        int[] W = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < W.length; i++) {
            W[i] = sc.nextInt();
            min = Math.min(min, W[i]);
        }
        List<List<Integer>> cycles = findCycles(W);
        //printCycles(cycles);
        System.out.println(calcCost(W, cycles, min));
    }
    public static void main(String[] args) {
        new Main().run();
    }
}

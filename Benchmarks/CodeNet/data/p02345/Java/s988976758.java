import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();

        SegTree segTree = new SegTree(N, new Min());
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (q[0] == 0) {
                segTree.update(q[1], q[2]);
            } else {
                System.out.println(segTree.query(q[1], q[2]));
            }
        }
    }

}

class SegTree {

    class Node {
        long val;
    }

    int size;
    Operation op;
    Node[] nodes;

    public SegTree(int size, Operation op) {
        this.size = Integer.highestOneBit(size);
        if (size > this.size) {
            this.size <<= 1;
        }
        this.op = op;
        nodes = new Node[this.size * 2];
        for (int i = 1; i < this.size * 2; i++) {
            nodes[i] = new Node();
            nodes[i].val = op.getInit();
        }
    }

    public void update(int index, int val) {
        update(index, val, true);
    }

    public void update(int index, int val, boolean overwrite) {
        index += size;
        nodes[index].val = overwrite ? val : op.calc(nodes[index].val, val);
        while ((index >>= 1) > 0) {
            nodes[index].val = op.calc(nodes[2 * index].val, nodes[2 * index + 1].val);
        }
    }

    public long query(int fromInc, int toInc) {
        fromInc += size;
        toInc += size;
        long left = op.getInit();
        long right = op.getInit();
        while (fromInc <= toInc) {
            if ((fromInc & 1) > 0)
                left = op.calc(left, nodes[fromInc++].val);
            if ((toInc & 1) == 0)
                right = op.calc(right, nodes[toInc--].val);
            fromInc >>= 1;
            toInc >>= 1;
        }
        return op.calc(left, right);
    }
}

abstract class Operation {
    abstract public long getInit();

    abstract public long calc(long x, long y);
}

class Min extends Operation {

    @Override
    public long getInit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public long calc(long x, long y) {
        return Math.min(x, y);
    }
}


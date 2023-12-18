
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] parr = new int[n];
        int[] carr = new int[n];
        for (int i = 0; i < n; i++) {
            parr[i] = sc.nextInt() - 1;
        }

        for (int i = 0; i < n; i++) {
            carr[i] = sc.nextInt();
        }

        boolean visited[] = new boolean[n];

        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            List<Integer> loop = new ArrayList<>();
            int current = i;
            while (!visited[current]) {
                loop.add(carr[current]);
                visited[current] = true;
                current = parr[current];
            }

            long x = partialSolve(loop.size(), k, loop);
//            debug(x);
//            debug("-------");
            ans = Math.max(ans, x);
        }
        System.out.println(ans);

        // out.println("Hello World");
        out.flush();
    }

    long partialSolve(int n, int k, List<Integer> loop) {
        long[] accList = new long[3 * n + 1];
        accList[0] = 0;
        for (int j = 1; j <= 3 * n; j++) {
            accList[j] = loop.get((j - 1) % n) + accList[j - 1];
        }
//        debug(loop);
//        debug(accList);

        long ret = Long.MIN_VALUE;

//        for (int l = 0; l < n; l++) { // スタート地点をどこにするか
//            for (int count = 1; count <= k; count++) { // kの回数のルーぷ
//                ret = Math.max(ret, accList[l + count] - accList[l]);
//            }
//        }

        long loopSum = accList[n];
//        debug("loopSum", loopSum);

        if (k < n) {
            ret = Math.max(ret, noLoopMax(n, k, accList));
        } else {
            if (loopSum > 0) {
                long loopCount = k / n - 1;
                ret = Math.max(ret, noLoopMax(n, n + k % n, accList) + loopSum * loopCount);
            } else {
                ret = Math.max(ret, noLoopMax(n, n - 1, accList));
            }
        }

        return ret;
    }

    // k < nのときのmax
    long noLoopMax(int n, int k, long[] accList) {
        long ret = Long.MIN_VALUE;
        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r <= l + k; r++) {
                ret = Math.max(ret, accList[r] - accList[l]);
            }
        }
        return ret;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

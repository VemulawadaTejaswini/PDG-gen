import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();
        RMinQ rMinQ = new RMinQ(n, Integer.MAX_VALUE);
        for (int i = 0; i < q; i++) {
            int cmd = in.nextInt(),
                    x = in.nextInt(),
                    y = in.nextInt();
            if (cmd == 0) {
                rMinQ.update(x, y);
            }else {
                System.out.println(rMinQ.find(x,y));
            }
        }
    }
}

// by heap DST
class RMinQ{
    int[] heap;
    int n;

    static int log2(int n) {
        int ret = 0, pow = 1;
        while (pow <= n-1) {
            pow = pow * 2;
            ret += 1;
        }
        return ret;
    }

    RMinQ(int n, int val) {
        // construct complelte binary heap
        this.n = n;
        int heapLen = (int) Math.pow(2, log2(n) + 1);
        heap = new int[heapLen];
        Arrays.fill(heap, val);
    }

    void update(int i, int val) {
        if (i >= n || i < 0) {
            return;
        }

        if (n <= 1) {
            heap[1] = val;
            return;
        }

        update(1, val, i, 0, n);
    }
    private int update(int iheap, int val, int i, int left, int right) {
        if (i < left || i >= right) {
            return heap[iheap];
        }
        if (right - left <= 1) {
            heap[iheap] = val;
            return val;
        }


        heap[iheap] = Math.min(
                update(iheap * 2, val, i, left, (left + right) / 2),
                update(iheap * 2 + 1, val, i, (left + right) / 2, right)
        );
        return heap[iheap];
    }

    int find(int s, int t) {
        int iheap = 1;
        return find(s, t+1, 0, n, iheap);
    }
    private int find(int s, int t, int left, int right, int iheap) {
        if (s >= t) {
            return Integer.MAX_VALUE;
        }
        if (left == s && right == t) {
            return heap[iheap];
        }

        int mid = (left + right) / 2;

        return Math.min(
                find(Math.max(s, left), Math.min(t, mid), left, mid, iheap * 2),
                find(Math.max(s, mid), Math.min(t, right), mid, right, iheap * 2 + 1)
        );
    }

}


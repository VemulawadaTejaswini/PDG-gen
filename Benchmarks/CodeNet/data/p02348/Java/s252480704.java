import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();

        RUpdateQ rUpdateQ = new RUpdateQ(n);

        for (int i = 0; i < q; i++) {
            int cmd = in.nextInt();
            if (cmd == 0) {
                int s = in.nextInt(),
                        t = in.nextInt(),
                        x = in.nextInt();
                rUpdateQ.update(s, t, x);
            }
            if (cmd == 1) {
                int index = in.nextInt();
                System.out.println(rUpdateQ.find(index));
            }
        }


    }
}

class RUpdateQ{
    int[] heap;
    int n;

    static int _heap_size(int n) {
        int pow2 = 1;
        while (pow2 < n) {
            pow2 *= 2;
        }
        return pow2 * 2;
    }

    RUpdateQ(int n) {
        this.n = n;
        heap = new int[_heap_size(n)];
        Arrays.fill(heap, Integer.MAX_VALUE);
    }


    public void update(int s, int t, int x) {
        update(s, t+1, x, 0, n, 1);

    }

    private void update(int s, int t, int x, int l, int r, int ih) {
        if (s >= t) {
            return;
        }
        if (s == l && t == r) {
            heap[ih] = x;
            return;
        }
        // else: [s,t) in [l, r)
        if (heap[ih] > 0) {
            // broadcast to next level
            heap[ih * 2] = heap[ih];
            heap[ih * 2 + 1] = heap[ih];
            // indicate multi val
            heap[ih] = -1;
        }

        int mid = (l + r) / 2;
        update(Math.max(s, l), Math.min(mid, t), x, l, mid, ih * 2);
        update(Math.max(s, mid), Math.min(t, r), x, mid, r, ih * 2 + 1);
    }

    public int find(int index) {
        return find(index, 0, n, 1);
    }

    private int find(int index, int l, int r, int ih) {
        if (heap[ih] >= 0) {
            return heap[ih];
        }else {
            int mid = (l + r) / 2;
            if (index < mid) {
                return find(index, l, mid, ih * 2);
            }else {
                return find(index, mid, r, ih * 2 + 1);
            }
        }
    }
}


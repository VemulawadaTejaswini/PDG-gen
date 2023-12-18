import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();

        RAddQ rAddQ = new RAddQ(n);

        for (int i = 0; i < q; i++) {
            int cmd = in.nextInt();
            if (cmd == 0) {
                int s, t, x;
                s = in.nextInt();
                t = in.nextInt();
                x = in.nextInt();
                rAddQ.add(s, t, x);
            } else if (cmd == 1) {
                int t = in.nextInt();
                rAddQ.get(t);
            }
        }
    }
}


class RAddQ {
    int n, heap[];

    RAddQ(int n) {
        this.n = n;

        int heapLen = 1;
        while (heapLen < n) {
            heapLen *= 2;
        }
        heapLen = 2 * heapLen;

        heap = new int[heapLen];
    }

    void add(int s, int t, int x) {
        add(0, n, 0, s-1, t, x); // try start from 0, 1-n->0-n-1
    }

    private void add(int l, int r, int ih, int s, int t, int x) {
        if (s >= t) {
            return;
        }
        if (s == l && t == r) {
            heap[ih] += x;
            return;
        }

        int mid = (l + r) / 2;
        add(l, mid, ih * 2 + 1, Math.max(s, l), Math.min(t, mid), x);
        add(mid, r, ih * 2 + 2, Math.max(s, mid), Math.min(t, r), x);
    }

    void get(int t) {
        System.out.println(get(0, n, 0, t-1));
    }

    private int get(int l, int r, int ih, int t) {
        if (r - l == 1) {
            return heap[ih];
        }

        int mid = (l + r) / 2;
        if (t < mid)
            return heap[ih] + get(l, mid, ih * 2 + 1, t);
        else
            return heap[ih] + get(mid, r, ih * 2 + 2, t);
    }
}


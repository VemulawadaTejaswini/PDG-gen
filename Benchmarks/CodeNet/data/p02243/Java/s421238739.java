import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    static Point[][] points;
    static int[] cost;

    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        points = new Point[n][];
        cost = new int[n];
        for (int i = 0; i < n; i++) {
            int q = fs.nextInt();
            int e = fs.nextInt();
            points[q] = new Point[e];
            for (int j = 0; j < e; j++) {
                points[q][j] = new Point(fs.nextInt(), fs.nextInt());
            }
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(new Point(0, 0));
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[0] = 0;
        while (!priorityQueue.isEmpty()) {
            Point poll = priorityQueue.poll();
            for (Point po : points[poll.t]) {
                int nk = po.k + poll.k;
                if (nk < cost[po.t]) {
                    cost[po.t] = nk;
                    priorityQueue.add(new Point(po.t, nk));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i).append(" ").append(cost[i]).append("\n");
        }
        System.out.print(sb);
    }


}

class Point implements Comparable<Point> {
    int t;
    int k;

    public Point(int t, int k) {
        this.k = k;
        this.t = t;
    }

    @Override
    public int compareTo(Point o) {
        return t - o.t;
    }
}

class PriorityQueue {
    static Point[] heap = new Point[20000];
    static int h = 0;

    public Point poll() {
        change(1, h);
        h--;
        minHeapify(1);
        return heap[h + 1];
    }

    public void add(Point po) {
        h++;
        heap[h] = po;
        int k = h;
        while (k / 2 > 0) {
            k = k / 2;
            minHeapify(k);
        }
    }

    void minHeapify(int i) {
        int l = 2 * i;
        int r = 2 * i + 1;
        int minimum = i;
        if (l <= h && heap[l].k < heap[i].k) {
            minimum = l;
        }
        if (r <= h && heap[r].k < heap[minimum].k) {
            minimum = r;
        }
        if (minimum != i) {
            change(i, minimum);
            minHeapify(minimum);
        }
    }

    void change(int i, int j) {
        Point i1 = heap[i];
        heap[i] = heap[j];
        heap[j] = i1;
    }

    public boolean isEmpty() {
        return h==0;
    }
}



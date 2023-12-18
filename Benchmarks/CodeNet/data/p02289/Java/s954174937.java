import java.util.Scanner;

public class Main {
    static final int MAX = 2000000;
    static int       p   = 0;
    static int[]     h   = new int[MAX + 1];;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String order = sc.next();
            if (order.startsWith("i")) {
                insert(sc.nextInt());

            } else if (order.startsWith("ex")) {
                System.out.println(heapExtractMax());

            } else {
                break;
            }
        }
    }


    static void insert(int key) {
        p++;
        h[p] = Integer.MIN_VALUE;
        heapIncreaseKey(p, key);
    }

    static void heapIncreaseKey(int i, int key) {
        if (key < h[i]) {
            // error
        }
        h[i] = key;
        while (i > 1 && h[i / 2] < h[i]) {
            int temp = h[i];
            h[i] = h[i / 2];
            h[i / 2] = temp;
            i = i / 2;
        }
    }

    static int heapExtractMax() {
        if (p < 1) {
            // error
        }
        int max = h[1];
        h[1] = h[p];
        p--;
        maxHeapify(h, 1); 
        return max;
    }

    static int l(int i) {
        return 2 * i;
    }

    static int r(int i) {
        return 2 * i + 1;
    }

    static void maxHeapify(int[] h, int idx) {
        int n = p;
        int l = l(idx);
        int r = r(idx);
 
        int maxNodeIdx = 0;
        if (l <= n && h[l] > h[idx]) {
            maxNodeIdx = l;
        } else {
            maxNodeIdx = idx;
        }
        if (r <= n && h[r] > h[maxNodeIdx]) {
            maxNodeIdx = r;
        }

        if (maxNodeIdx != idx) {
            int temp = h[idx];
            h[idx] = h[maxNodeIdx];
            h[maxNodeIdx] = temp;
            maxHeapify(h, maxNodeIdx);
        }
    }
}

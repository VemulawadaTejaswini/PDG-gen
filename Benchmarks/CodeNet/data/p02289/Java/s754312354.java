import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] heap = new int[2000000];
    static int h = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        do {
            s = bf.readLine();
            if (s.charAt(2) == 's') {
                insert(Integer.parseInt(s.substring(7)));
            }else if (s.charAt(2)=='t'){
                extractMax();
            }
        } while (s.length() != 3);
        System.out.print(sb);
    }

    private static void extractMax() {
        sb.append(heap[1]).append("\n");
        change(1,h);
        h--;
        maxHeapify(1);
    }

    private static void insert(int m) {
        h++;
        heap[h] = m;
        int k =h;
        while (k / 2 > 0) {
            k=k/2;
            maxHeapify(k);
        }
    }

    private static void bulidMaxHeap() {
        for (int i = h  / 2; i > 0; i--) {
            maxHeapify(i);
        }
    }

    private static void maxHeapify(int i) {
        int l = 2 * i;
        int r = 2 * i + 1;
        int largest = i;
        if (l <= h && heap[l] > heap[i]) {
            largest = l;
        }
        if (r <= h && heap[r] > heap[largest]) {
            largest = r;
        }
        if (largest != i) {
            change(i, largest);
            maxHeapify(largest);
        }
    }

    private static void change(int i, int j) {
        int i1 = heap[i];
        heap[i] = heap[j];
        heap[j] = i1;
    }
}

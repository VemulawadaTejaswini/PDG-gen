import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HEAP a = new HEAP();
        while (in.hasNext()) {
            String op = in.next();
            if (op.startsWith("i")) {
                a.insert(in.nextInt());
            } else if (op.equals("extract")) {
                System.out.println(a.extract());
            } else {
                break;
            }
        }
    }

}
class HEAP {

    int[] heap = new int[2000001];
    int size = 0;

    int parent(int pos) {
        return pos/2;
    }

    boolean isLeaf(int pos) {
        if (pos >= (size/2) && pos <= size) {
            return true;
        } else {
            return false;
        }
    }

    void heapify(int pos) {

        if (isLeaf(pos) == false) {
            if (heap[pos] < heap[2 * pos] || heap[pos] < heap[2 * pos + 1]) {
                if (heap[2 * pos] > heap[2 * pos + 1]) {
                    int x = heap[pos];
                    heap[pos] = heap[2 * pos];
                    heap[2 * pos] = x;
                    heapify(2 * pos);
                } else {
                    int x = heap[pos];
                    heap[pos] = heap[2 * pos + 1];
                    heap[2 * pos + 1] = x;
                    heapify(2 * pos + 1);
                }
            }
        }
    }

    void insert(int key) {
        size++;
        heap[size] = key;
        int current = size;

        while (heap[current]>heap[parent(current)] && parent(current) != 0) {
            int x = heap[current];
            heap[current] = heap[current /2];
            heap[current/2] = x;
            current = parent(current);
        }

    }

    int extract () {
        int removed = heap[1];
        heap[1] = heap[size--];
        heap[size+1] = 0;
        heapify(1);
        return removed;
    }
}


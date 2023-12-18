import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    int heapSize = 0;
    int[] heap = new int[2000000];
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            String op = input.next();
            if ("insert".equals(op)) {
                maxHeapInsert(heap, input.nextInt());
            } else if ("extract".equals(op)) {
                System.out.println(heapExtractMax(heap));
            } else if ("end".equals(op)) {
                break;
            }
        }
    }
    int parent(int i) {
        return i / 2;
    }
    int left(int i) {
        return i * 2;
    }
    int right(int i) {
        return i * 2 + 1;
    }
    void buildMaxHeap(int[] A) {
        for (int i = heapSize/2; i > 0; i--) {
            maxHeapify(A, i);
        }
    }
    void maxHeapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);
        int largest;
        if (l <= heapSize && A[l] > A[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= heapSize && A[r] > A[largest]) largest = r;
        if (largest != i) {
            swap(A, i, largest);
            maxHeapify(A, largest);
        }
    }
    void maxHeapInsert(int[] A, int key) {
        A[++heapSize] = Integer.MIN_VALUE;
        heapIncreaseKey(A, heapSize, key);
    }
    void heapIncreaseKey(int[] A, int i, int key) {
        if (key < A[i]) throw new RuntimeException("新しいキーは現在のキーより小さい");
        A[i] = key;
        while (i > 1 && A[parent(i)] < A[i]) {
            swap(A, i, parent(i));
            i = parent(i);
        }
    }
    int heapExtractMax(int[] A) {
        if (heapSize < 1) throw new RuntimeException("ヒープアンダーフロー");
        int max = A[1];
        A[1] = A[heapSize--];
        maxHeapify(A, 1);
        return max;
    }
    void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}
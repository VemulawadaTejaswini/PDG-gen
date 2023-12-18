
import java.util.*;
public class Main {
    static final int MAX = 2000000;
    static int p = 0;
    static int[] h = new int[MAX + 1];;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
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
        if (key < h[p]) {
            //error
        }
        h[i] = key;
        while(i > 1 && h[i/2] < h[i]) {
            int temp = h[i];
            h[i] = h[i/2];
            h[i/2] = temp;
            i = i/2;
        }
    }
    
    static int heapExtractMax() {
        if (p < 1) {
            // error
        }
        int max = h[1];
        h[1] = h[p];
        p--;
        ALDS1_9_B_MaximumHeap.maxHeapify(h, 1);  // root以外の節点はヒープ化済み
        return max;
    }
 }


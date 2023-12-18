import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int h;

    private static void maxHeapify(int[] a, int i) {
        int l = i * 2;
        int r = i * 2 + 1;

        int largest = (l <= h && a[l] > a[i])? l : i;
        if(r <= h && a[r] > a[largest]) largest = r;

        if(largest != i) {
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;
            maxHeapify(a, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(true) {
            String cmd = sc.next();
            if(cmd.equals("insert")) pq.add(sc.nextInt());
            else if(cmd.equals("extract")) System.out.println(pq.poll());
            else break;
        }

        sc.close();
    }
}


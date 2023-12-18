import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]), k = Integer.parseInt(line[1]);
        int[] p = new int[n];
        line = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            p[i] = Integer.parseInt(line[i]);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(a -> -a));

        for (int i = 0; i < n; ++i) {
            if (heap.size() < k) {
                heap.add(p[i]);
            } else {
                if (heap.peek() > p[i]) {
                    heap.remove();
                    heap.add(p[i]);
                }
            }
        }

        int res = 0;

        for (int price: heap) {
            res += price;
        }

        bw.write(Integer.toString(res));
        bw.newLine();

        bw.close();
        br.close();
    }
}

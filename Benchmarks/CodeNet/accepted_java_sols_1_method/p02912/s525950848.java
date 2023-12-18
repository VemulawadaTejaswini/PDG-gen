import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>(n, Comparator.reverseOrder());
        for(int i=0; i<n; i++) {
            a.add(in.nextInt());
        }
        for(int i=0; i<m; i++) {
            int ai = a.poll();
            a.add((int)Math.floor(ai/2.0));
        }
        long s = 0;
        while(!a.isEmpty()) {
            s += a.poll();
        }
        System.out.println(s);
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> l = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> r = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            l.add(Integer.parseInt(sc.next()));
            r.add(Integer.parseInt(sc.next()));
        }

        int result = r.peek() - l.peek() + 1;

        System.out.println(result < 0 ? 0 : result);
    }
}
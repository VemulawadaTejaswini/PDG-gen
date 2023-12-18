import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            PriorityQueue<Integer> s = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                s.add(sc.nextInt());
            }
            s.poll();
            int p = 0;
            while (s.size() > 1) {
                p += s.poll();
            }
            System.out.println(p / (n - 2));
        }
    }
}
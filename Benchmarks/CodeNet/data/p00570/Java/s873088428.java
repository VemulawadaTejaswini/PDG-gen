import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int prev = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            queue.add(x - prev - 1);
            prev = x;
        }
        int sum = n;
        for (int i = 0; i < n - k; i++) {
            sum += queue.poll();
        }
        System.out.println(sum);
    }
}

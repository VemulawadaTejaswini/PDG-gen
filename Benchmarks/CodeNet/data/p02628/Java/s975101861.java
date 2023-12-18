import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < k; i++) {
            count += q.poll();
        }
        System.out.println(count);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        PriorityQueue<Integer>[] que = new PriorityQueue[3];
        for (int i = 0; i < 3; i++) {
            que[i] = new PriorityQueue<>(Collections.reverseOrder()); // 降順で
        }
        
        for (int i = 0; i < a; i++) {
            que[0].add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            que[1].add(sc.nextInt());
        }
        for (int i = 0; i < c; i++) {
            que[2].add(sc.nextInt());
        }
        
        long ans = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // 降順で
        for (int i = 0; i < x; i++) {
            queue.add(que[0].poll());
        }
        for (int i = 0; i < y; i++) {
            queue.add(que[1].poll());
        }
        for (int i = 0; i < c; i++) {
            queue.add(que[2].poll());
        }
        
        for (int i = 0; i < x + y; i++) {
            ans += (long)queue.poll();
        }
        System.out.println(ans);
        
    }
}
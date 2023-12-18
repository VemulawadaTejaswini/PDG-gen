import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            q.offer(sc.nextInt());
        }
        long res = 0;
        Queue<Integer> max = new LinkedList<>();
        max.offer(q.poll());
        res += max.poll();
        max.offer(q.poll());
        while(!q.isEmpty()){
            int curr = max.poll();
            max.offer(q.poll());
            res += curr;
            if(!q.isEmpty()){
                max.offer(q.poll());
                res += curr;
            }
        }
        System.out.println(res);
    }
}
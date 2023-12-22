import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->{return b-a;});
        for(int i=0;i<N;i++) pq.offer(sc.nextInt());
        for(int i=0;i<M;i++){
            int b = pq.poll();
            pq.offer(b/2);
        }
        long ans = 0l;
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        System.out.println(ans);
    }
}

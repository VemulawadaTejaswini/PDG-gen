import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++)
        	pq.offer(sc.nextDouble());


        while(pq.size() > 1) {
        	double a = pq.poll();
        	double b = pq.poll();
        	pq.offer((a + b) / 2.0);
        }
        System.out.println(pq.peek());
    }
}

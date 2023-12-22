import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PriorityQueue pq = new PriorityQueue ();
        
        for(int i = 0; i < 2*N; i++) {
            pq.add(scan.nextInt());
        }
        
        int total = 0, value;
        for(int i = 0; i < N; i++) {
            total += (int)pq.poll();
            pq.poll();
        }
        System.out.println(total);
    }
}
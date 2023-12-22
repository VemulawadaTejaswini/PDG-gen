import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Queue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++){
            queue.add( sc.nextInt() );
        }
        
        int total = 0;
        for(int i = 0; i < N; i++){
            int x = queue.poll();
            if( i == N-1 ) x /= 2;
            total += x;
        }
        
        System.out.println(total);
        
    }
}

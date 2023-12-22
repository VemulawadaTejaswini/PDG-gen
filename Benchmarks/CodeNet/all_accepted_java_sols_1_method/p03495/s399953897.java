import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N+1];
        
        for(int i = 0; i < N; i++ ) {
            int x = sc.nextInt();
            A[x]++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < N + 1; i++ ) {
            if( A[i] > 0 ) {
                pq.add( A[i] );
            }
        }
        
        int ans = 0;
        
        while(true) {
            if( pq.size() <= K ) {
                break;
            }
            
            ans += pq.poll();
        }
        System.out.println(ans);
    }
}

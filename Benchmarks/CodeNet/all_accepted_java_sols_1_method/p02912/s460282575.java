import java.util.*;
import java.util.PriorityQueue;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            que.add(A[i]);
        }
        for(int i=0; i<M; i++){
            int x = que.poll();
            x = x / 2;
            que.add(x);
        }
        long ans = 0;
        for(int i=0; i<N; i++){
            ans += que.poll();
        }
        System.out.println(ans);
    }
}
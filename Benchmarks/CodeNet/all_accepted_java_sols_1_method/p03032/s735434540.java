import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] v = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(sc.next());
        }
        
        int max = 0;
        PriorityQueue<Integer> queue;
        int x = Math.min(n, k);
        for(int a = 1; a <= x; a++){
            for(int b = 0; b <= a; b++){
                
                queue = new PriorityQueue<>();
                for(int c = 0; c < n; c++){
                    if(b <= c && c < (b+n-a)){
                        continue;
                    }
                    queue.offer(v[c]);
                }
                for(int i = 0; i < k-a; i++){
                    if(queue.isEmpty()) break;
                    if(queue.peek() < 0){
                        queue.poll();
                    }
                }
                int value = 0;
                while(!queue.isEmpty()){
                    value += queue.poll();
                }
                if(value > max){
                    max = value;
                }
                if(a == n) break;
            }
        }
        
        System.out.println(max);
    }
}
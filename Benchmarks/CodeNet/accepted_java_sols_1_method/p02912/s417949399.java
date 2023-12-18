import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < n; i++){
            a.offer(Integer.parseInt(sc.next()));
        }
        
        for(int i = 0; i < m; i++){
            a.offer(a.poll()/2);
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += a.poll();
        }
        
        System.out.println(ans);
    }
}
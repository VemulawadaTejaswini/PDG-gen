import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++){
            int c = sc.nextInt();
            int t = sc.nextInt();
            if( t <= T ) queue.add(c);
        }
        
        if( queue.isEmpty() ){
            System.out.println("TLE");
        } else {
            System.out.println(queue.poll() );
        }
        
    }
}

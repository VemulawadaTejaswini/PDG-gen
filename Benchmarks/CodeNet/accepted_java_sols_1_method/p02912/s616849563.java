
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < N; i++){
            pq.add(sc.nextInt());
        }

        for(int i = 0; i < M; i++){
            pq.add(pq.poll() / 2);
        }

        long minSum = 0;
        for(int i = 0; i < N; i++){
            minSum = minSum + pq.poll();
        }

        System.out.println(minSum);

    }
}





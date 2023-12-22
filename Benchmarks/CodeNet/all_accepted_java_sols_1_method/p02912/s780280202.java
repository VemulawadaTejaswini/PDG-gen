import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());

        Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i = 0; i < N; ++i) {
            q.add(Integer.parseInt(scan.next()));
        }

        for (int j = 0; j < M; ++j) {
            q.add(q.poll() / 2);
        }

        long result = 0;
        
        for (int x : q) {
            result += x;
        }

        System.out.println(result);
		
		scan.close();
	}

}

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int n,k = 0;
		n = scanner.nextInt();
		k = scanner.nextInt(); // 買う果物

		while (n-- > 0){
			pq.add(scanner.nextInt());
		}

		int sum = 0;
		while (k-- > 0){
			sum += pq.poll();
		}
		System.out.println(sum);

	}

}

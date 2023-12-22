import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			PriorityQueue<Double> pq = new PriorityQueue();
			
			for (int i = 0; i < N; ++i) {
				pq.add(in.nextDouble());
			}
			
			while (pq.size() > 1) {
				double ingredient1 = pq.poll();
				double ingredient2 = pq.poll();
				double newIngredient = (ingredient1 + ingredient2) / 2;
				
				pq.add(newIngredient);
			}
			
			System.out.println(pq.peek());
		}
	}

}

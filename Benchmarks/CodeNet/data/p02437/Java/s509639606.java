import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<PriorityQueue<Integer>> pque = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			pque.add(new PriorityQueue<Integer>(Comparator.reverseOrder()));
		}

		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int command = sc.nextInt();
			int t = sc.nextInt();

			switch(command) {

			case 0:
				int x = sc.nextInt();
				pque.get(t).offer(x);
				break;

			case 1:
				if(!pque.get(t).isEmpty()) {
					System.out.println(pque.get(t).peek());
				}
				break;

			case 2:
				if(!pque.get(t).isEmpty()) {
					pque.get(t).poll();
				}
				break;
			}
		}
	}
}

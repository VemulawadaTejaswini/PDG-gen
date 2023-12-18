import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			List<Queue<Integer>> array = new ArrayList<>();

			for(i = 0; i < n; i++) {
				array.add(new ArrayDeque<Integer>());
			}
			for(i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				int t = sc.nextInt();
				switch(order_number) {
				case 0 :
					array.get(t).add(sc.nextInt());
					break;
				case 1 :
					if(array.get(t).isEmpty()) {
						System.out.println();
						break;
					}
					Iterator<Integer> ite = array.get(t).iterator();
					System.out.print(ite.next());
					while(ite.hasNext()) {
						System.out.print(" " + ite.next());
					}
					break;
				case 2 :
					array.get(sc.nextInt()).addAll(array.get(t));
					array.remove(t);
					break;
				}
//				for(Queue<Integer> output : array) {
//					System.out.println(output);
//				}
			}
		}
	}
}


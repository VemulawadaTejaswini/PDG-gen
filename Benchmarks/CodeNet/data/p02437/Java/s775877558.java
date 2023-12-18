import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		ArrayList<PriorityQueue<Integer>> pque = new ArrayList<PriorityQueue<Integer>>();

		int n = in.nextInt(), loop = in.nextInt();
		for(int i = 0; i < n ; i++) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			pque.add(pq);
		}

		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next()), index = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					pque.get(index).add(Integer.parseInt(in.next()));
					break;

				case 1:
					if(!pque.get(index).isEmpty()) {
						out.println(pque.get(index).peek());
					}
					break;

				case 2:
					if(!pque.get(index).isEmpty()) {
						pque.get(index).poll();
					}
					break;
			}
		}
		out.flush();
		in.close();

	}

}




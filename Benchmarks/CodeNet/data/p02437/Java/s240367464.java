import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<PriorityQueue<Integer>> S = new ArrayList<PriorityQueue<Integer>>();
			for(int i=0;i<n;i++) {
				S.add(new PriorityQueue<>(Collections.reverseOrder()));
			}

			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				int t = sc.nextInt();
				switch(query) {
				case 0:
					S.get(t).add(sc.nextInt());
					break;
				case 1:
					if(S.get(t).size()>0)
						System.out.println(S.get(t).peek());
					break;
				case 2:
					if(S.get(t).size()>0)
						S.get(t).poll();
					break;
				}
			}
		}
	}
}

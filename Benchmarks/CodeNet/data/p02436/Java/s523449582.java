import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Queue<Integer>> que = new ArrayList<>();
		
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			que.add(new ArrayDeque<Integer>());
		}
		
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {
			
			case 0:
				int b = scan.nextInt();
				que.get(a).offer(b);
				break;
				
			case 1:
				if(!que.get(a).isEmpty())
				System.out.println(que.get(a).element());
				break;
				
			case 2:
				if(!que.get(a).isEmpty())
				que.get(a).poll();
				break;
			}
		}
	}
}


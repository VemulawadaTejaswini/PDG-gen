import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			Queue<Integer> q = new LinkedList<Integer>();
			while (true) {
				String x = sc.nextLine();


				if (x.length() == 1) {
					if (Integer.parseInt(x) == 0) break;					
				}

				int total = 0;

				for (int i=0; i<x.length(); i++) {
					String s = x.substring(i,i+1);
					int a = Integer.parseInt(s);
					total += a;
				}
				q.add(total);
			}
			int a = q.size();
			for (int i=0; i<a; i++) {
				System.out.println(q.remove());
			}
		}
	}
}


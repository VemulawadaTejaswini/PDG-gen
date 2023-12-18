import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			PriorityQueue<Pair> que = new PriorityQueue<Pair>(10,new MyComparator());
			for(int i = 0; i < n; i++) {
				String a = stdIn.next();
				int w = stdIn.nextInt();
				int l = stdIn.nextInt();
				int d = stdIn.nextInt();
				que.add(new Pair(a,w*3 + d));
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(que.peek().getId() +"," + que.poll().getPoint());
			}
			System.out.println();
		}
	}
}

class Pair {
	private String id;
	private int point;
	public Pair(String id, int point) {
		this.id = id;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public int getPoint() {
		return point;
	}
}
class MyComparator implements Comparator<Pair>{

	public int compare(Pair o1, Pair o2) {
		if(o1.getPoint() < o2.getPoint()) {
			return 1;
		}
		else if(o1.getPoint() > o2.getPoint()) {
			return -1;
		}
		return 0;
	}
	
}
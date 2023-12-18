import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean al = false;
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			if(al) {
				System.out.println();
			}
			else {
				al = true;
			}
			
			PriorityQueue<Pair> que = new PriorityQueue<Pair>(10,new MyComparator());
			for(int i = 0; i < n; i++) {
				String a = stdIn.next();
				int w = stdIn.nextInt();
				int l = stdIn.nextInt();
				int d = stdIn.nextInt();
				que.add(new Pair(a,w*3 + d,i));
			}
			
			for(int i = 0; i < n; i++) {
				Pair tmp = que.poll();
				System.out.println(tmp.getId() +"," + tmp.getPoint());
			}
		}
	}
}

class Pair {
	private String id;
	private int point;
	private int number;
	public Pair(String id, int point,int number) {
		this.id = id;
		this.point = point;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public int getPoint() {
		return point;
	}
	public int getNumber() {
		return number;
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
		else if(o1.getNumber() < o2.getNumber()){
			return -1;
		}
		else if(o1.getNumber() > o2.getNumber()){
			return 1;
		}
		return 0;
	}
	
}
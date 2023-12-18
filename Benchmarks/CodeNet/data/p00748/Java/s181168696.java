import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> oddList = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			
			int tmp = n;
			int c = 0;
			queue.removeAll(queue);
			int ans = solv(n);
			IN:while(true) {
			for(int i = oddList.size()-1; i >= 0; i--) {
					if(oddList.get(i) <= tmp) {
						tmp -= oddList.get(i);
						c++;
						break;
					}
					if(tmp == 0) {
						break IN;
					}
				}
			}
			System.out.println(ans + " " + c);
			System.gc();
		}
	}
	public static ArrayDeque<Data> queue = new ArrayDeque<Data>();
	public static int solv(int a) {
		int ans = 0;
		queue.add(new Data(a,0,0));
		while(true) {
			int ax = bfs(queue.poll());
			if(ax != 0) {
				return ax;
			}
		}
	}
	public static int  bfs(Data a) {
		if(a.a == a.b) return a.c;
		if(a.a < a.b) return 0;
		for(int i = 0; i < list.size(); i++) {
			queue.add(new Data(a.a,a.b + list.get(i),a.c+1));
		}
		return 0;
	}
	
	public static void makeList() {
		for(int i = 1; i < 1000000; i++) {
			int a = i * (i + 1) * (i + 2);
			if(a % 6 == 0) {
				if(a / 6 > 100000) break;
				list.add(a / 6);
				if((a / 6) % 2 == 1) {
					oddList.add(a/6);
				}
			}
		}
	}
	
}

class Data {
	int a;
	int b;
	int c;
	Data(int d, int e, int f) {
		a = d;
		b = e;
		c = f;
	}
}
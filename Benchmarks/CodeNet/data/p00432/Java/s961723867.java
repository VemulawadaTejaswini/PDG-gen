import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

//Sheets
public class Main{

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}
	
	class E implements Comparable<E>{
		int id, type, x;
		public E(int id, int type, int x) {
			this.id = id;
			this.type = type;
			this.x = x;
		}
		public int compareTo(E o) {
			return x-o.x;
		}		
	}
	
	int[] x1, y1, x2, y2;
	int n, r, area, len;
	int mask = (1<<16)-1;
	
	void f(){
		PriorityQueue<E> q = new PriorityQueue<E>(n);
		for(int i=0;i<n;i++){
			q.add(new E(i, 0, x1[i]));
			q.add(new E(i, 1, x2[i]));
		}
		int preX = 0;
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> range = new ArrayList<Integer>();
		while(!q.isEmpty()){
			E e = q.poll();
			len+=range.size()*2*(e.x-preX);
			for(int m:range){
				int s = m>>16, t = m&mask;
				area+=(e.x-preX)*(t-s);
			}
			if(e.type==0)set.add(e.id);
			else set.remove(e.id);
			preX = e.x;
			while(!q.isEmpty() && q.peek().x==e.x){
				E ee = q.poll();
				if(ee.type==0)set.add(ee.id);
				else set.remove(ee.id);
			}
			range.clear();
			List<Integer> list = new ArrayList<Integer>();
			for(int i:set)list.add((y1[i]<<16)|y2[i]);
			Collections.sort(list);
			int L = -1, R = -1;
			for(int m:list){
				int s = m>>16, t = m&mask;
				if(R < s){
					if(R!=-1)range.add((L<<16)|R);
					L = s; R = t;
				}
				else R = Math.max(R, t);
			}
			if(R!=-1)range.add((L<<16)|R);
		}
	}
	
	void run(){
		Scanner sc = new Scanner();
		x1 = new int[10000]; y1 = new int[10000]; x2 = new int[10000]; y2 = new int[10000];
		for(;;){
			n = sc.nextInt(); r = sc.nextInt();
			if((n|r)==0)break;
			long T = System.currentTimeMillis();
			area = len = 0;
			for(int i=0;i<n;i++){
				x1[i] = sc.nextInt(); y1[i] = sc.nextInt();
				x2[i] = sc.nextInt(); y2[i] = sc.nextInt();
			}
			f();
			if(r==2){
				area = 0;
				for(int i=0;i<n;i++){
					int t = x1[i];
					x1[i] = y1[i];
					y1[i] = t;
					t = x2[i];
					x2[i] = y2[i];
					y2[i] = t;
				}
				f();
			}
			System.out.println(area);
			if(r==2)System.out.println(len);
			System.out.println(System.currentTimeMillis()-T);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
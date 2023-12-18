import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//Surf Smelt Fishing Contest II
public class Main{

	int[] num;
	
	void run(){
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt(), Q = sc.nextInt();
		num = new int[n+1];
		Queue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return num[o1]==num[o2] ? o1-o2 : num[o2]-num[o1];
			}
		});
		for(int i=1;i<=n;i++)q.add(i);
		while(Q--!=0){
			int a = sc.nextInt(), v = sc.nextInt();
			q.remove(a);
			num[a]+=v;
			q.add(a);
			int res = q.peek();
			pw.write(res+" "+num[res]+"\n");
		}
		pw.flush();
	}
	
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
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
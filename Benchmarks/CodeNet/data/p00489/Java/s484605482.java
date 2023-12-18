import java.util.Arrays;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class R implements Comparable<R>{
		int id, p;
		public R(int id) {
			this.id = id;
		}
		public int compareTo(R o) {
			return o.p - p;
		}
	}
	
	void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] res = new int[n];
		R[] r = new R[n];
		for(int i = 0; i < n; i++)r[i] = new R(i);
		for(int i = 0; i < n * (n - 1) / 2; i++){
			int s = scan.nextInt() - 1,
					t = scan.nextInt() - 1,
					ps = scan.nextInt(),
					pt = scan.nextInt();
			if(ps < pt)r[t].p += 3;
			else if(pt < ps)r[s].p += 3;
			else{
				r[s].p++;
				r[t].p++;
			}
		}
		Arrays.sort(r);
		int v = 1;
		res[r[0].id] = 1;
		for(int i = 1; i < n; i++){
			if(r[i].p != r[i - 1].p)v = i + 1;
			res[r[i].id] = v;
		}
		for(int x:res)System.out.println(x);
	}
}
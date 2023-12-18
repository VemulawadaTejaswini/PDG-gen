import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//Shuffle
public class Main{

	class R implements Comparable<R>{
		int s, t;
		public R(int s, int t) {
			this.s = s;
			this.t = t;
		}
		public int compareTo(R o) {
			return s-o.s;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int m = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
			int[] ps = new int[m], qs = new int[m];
			for(int i=0;i<m;i++){
				ps[i] = sc.nextInt(); qs[i] = sc.nextInt();
			}
			LinkedList<R> l = new LinkedList<R>();
			l.add(new R(p, q));
			for(int Q=m-1;Q>=0;Q--){
				int x = ps[Q], y = qs[Q];
//				LinkedList<R> next = new LinkedList<R>();
				int L = l.size();
				for(int i=0;i<L;i++){
					R v = l.get(i);
					if(v.t<=n-y){
						v.s+=y; v.t+=y;
//						next.add(new R(v.s+y, v.t+y));
					}
					else if(v.s<=n-y){
						if(v.t<=n-x){
							l.add(new R(x+1, v.t+x+y-n));
							v.s+=y; v.t = n;
						}
						else{
							l.add(new R(x+1, y));
							l.add(new R(1, v.t+x-n));
							v.s+=y; v.t = n;
						}
//						next.add(new R(v.s+y, n));
//						l.remove(i); l.add(i, new R(n-y+1, v.t)); i--;
					}
					else if(v.t<=n-x){
						v.s+=x+y-n; v.t+=x+y-n;
//						next.add(new R(v.s+x+y-n, v.t+x-n+y));
					}
					else if(v.s<=n-x){
						l.add(new R(1, v.t+x-n));
						v.s += x+y-n; v.t = y;
//						l.remove(i); l.add(i, new R(n-x+1, v.t)); i--;
//						next.add(new R(v.s+x+y-n, y));
					}
					else {
						v.s+=x-n; v.t+=x-n;
//						next.add(new R(v.s+x-n, v.t+x-n));
					}
				}
				Collections.sort(l);
				for(int i=0;i+1<l.size();i++){
					if(l.get(i).t+1==l.get(i+1).s){
						R v = new R(l.get(i).s, l.get(i+1).t);
						l.remove(i); l.remove(i); l.add(i, v); i--;
					}
				}
			}
			int res = 0;
			for(R v:l){
				if(v.t<=r)res+=v.t-v.s+1;
				else if(v.s<=r)res+=r-v.s+1;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
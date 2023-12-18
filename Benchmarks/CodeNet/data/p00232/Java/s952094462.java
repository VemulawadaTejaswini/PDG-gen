import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Life Game
public class Main{

	static class P{
		int p, m;
		public P(int p, int m) {
			this.p = p;
			this.m = m;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int n = sc.nextInt();
			int e = sc.nextInt();
			if((x|n|e)==0)break;
			int[] v = new int[x];
			for(int i=0;i<x;i++)v[i]=sc.nextInt();
			int[][] ev = new int[n][2];
			while(e--!=0){
				int p = sc.nextInt();
				int k = sc.nextInt();
				int val = sc.nextInt();
				ev[p][0] = k;
				ev[p][1] = val;
			}
			double exp = 0;
			List<P> l = new ArrayList<P>();
			l.add(new P(0,0));
			int step = 0;
			while(!l.isEmpty()){
				List<P> next = new ArrayList<P>();
				int get = 0;
				for(P p:l){
					if(p.p>=n-1){
						get += p.m;
						continue;
					}
					for(int i=0;i<x;i++){
						int ns = p.p + v[i];
						int nm = p.m;
						if(ns<n && ev[ns][0]!=0){
							if(ev[ns][0]==1){
								ns += ev[ns][1];
							}
							else if(ev[ns][0]==2){
								nm += ev[ns][1];
							}
							else nm = Math.max(0, nm-ev[ns][1]);
						}
						next.add(new P(ns, nm));
					}
				}
				exp += get*1.0/Math.pow(x, step);
				l = next;
				step++;
			}
			System.out.println((int)exp);
		}
	}
}
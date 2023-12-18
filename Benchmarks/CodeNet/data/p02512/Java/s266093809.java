import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static class P implements Comparable<P>{
		public String name;
		public int day;
		public int start;
		public int value;
		public boolean watch;
		public P(String name, int day, int start) {
			this.name = name;
			this.day = day;
			this.start = start;
			watch = false;
//			if(start>=2400)start-=2400;
			value = day*24*60 + (start/100)*60 + start%60;
		}
		public int compareTo(P o) {
			return value-o.value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			Map<String, Integer> ref = new HashMap<String, Integer>();
			P[] p = new P[n];
			for(int i=0;i<n;i++){
				String m = sc.next();
				ref.put(m, i);
				p[i] = new P(m, sc.nextInt(), sc.nextInt());
			}
			boolean[] t = new boolean[24*60*8];
			int m = sc.nextInt();
			boolean f = true;
			while(m--!=0){
				int id = ref.get(sc.next());
				if(t[p[id].value+1] || t[p[id].value+29]){
					f = false;
				}
				for(int i=p[id].value;i<=p[id].value+30;i++){
					t[i] = true;
					if(i<24*60){
						t[i+24*60*7] = true;
					}
				}
				p[id].watch = true;
//				System.out.println("Watch:" + p[id].value);
			}
			if(!f){
				System.out.println(-1);continue;
			}
			Arrays.sort(p);
			for(P v : p){
				if(v.watch)continue;
				boolean k = !t[v.value+1] && !t[v.value+29];
				if(k){
					v.watch = true;
					for(int i=v.value;i<=v.value+30;i++){
						t[i] = true;
						if(i<24*60){
							t[i+24*60*7] = true;
						}
					}
				}
			}
			int c = 0;
			for(P v:p){
//				System.out.print(v.name + " " + v.value);
				c+=v.watch?1:0;
//				System.out.println(" " + v.watch);
			}
			System.out.println(c);
		}
	}
}
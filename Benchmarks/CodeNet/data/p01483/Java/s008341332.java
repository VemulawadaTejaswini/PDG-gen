import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Elevator
public class Main{

	int[] d;
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), W = sc.nextInt(), K = 0, INF = 1<<29;
		int[] w = new int[15], f = new int[15];
		for(int i=1;i<=n;i++){
			int k = sc.nextInt();
			while(k--!=0){
				int x = sc.nextInt();
				if(i==1)continue;
				w[K] = x; f[K++] = i;
			}
		}
		int[] sum = new int[1<<K];
		boolean[] valid = new boolean[1<<K];
		for(int S=0;S<1<<K;S++){
			for(int j=0;j<K;j++)if(((S>>j)&1)>0)sum[S]+=w[j];
			valid[S] = sum[S]<=W;
		}
		d = new int[1<<K];
		Arrays.fill(d, INF);
		boolean h = true;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Math.max(K, 1), new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return d[o1]-d[o2];
			}
		});
		d[(1<<K)-1] = 0;
		q.add((1<<K)-1);
		while(!q.isEmpty()){
			int S = q.poll();
//			System.out.println("S:"+S);
//			if(S==0){
//				System.out.println(d[0]); break;
//			}
			int sub = S;
			do{
				sub = (sub-1)&S;
				if(!valid[sub]||sub==0)continue;
				int max = 0;
				for(int j=0;j<K;j++)if(((sub>>j)&1)>0)max=Math.max(max, f[j]);
				int cost = d[S];
				if(h){
					if(max<=m)cost+=m-1;
					else cost+=max-m+max-1;
//					System.out.println("H:"+h+" cost:"+cost+" sub:"+sub+" max:"+max);
				}
				else cost+=2*(max-1);
//				System.out.println("sub: "+sub+" cost:"+cost);
				if(cost<d[S-sub]){
					d[S-sub] = cost; q.add(S-sub);
				}
			}while(sub!=S);
			h = false;
		}
		System.out.println(d[0]);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
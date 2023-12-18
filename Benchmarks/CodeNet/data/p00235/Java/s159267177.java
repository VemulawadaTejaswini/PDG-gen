import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0235().doIt();
	}

	class AOJ0235{
		int[][] cost;
		int n,result;
		void dikstra(){
			result = -1;
			int bit = 0;
			for(int i=0;i<n;i++)bit += (1<<i);
			//			System.out.println(bit>>0);
			//			System.out.println(Integer.toBinaryString(bit-(1<<0)));
			int[][] memo = new int[n][bit+1];
			for(int i=0;i<n;i++)Arrays.fill(memo[i], Integer.MAX_VALUE/2);
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(0, bit-(1<<0), 0));
			memo[0][bit-(1<<0)] = 0;
			while(!q.isEmpty()){
				State now = q.remove();
				int v = now.v;
				bit = now.bit;
//				System.out.println(v+" "+now.cost+" "+Integer.toBinaryString(bit));
				
				//この島の周りの島を見る。
				for(int i=0;i<n;i++)if(cost[i][v]>0&&(bit>>i)%2==1){
					bit-=(1<<i);
				}
				if(bit == 0){
					result = now.cost;break;
				}
				for(int i=0;i<n;i++)if(cost[i][v]>0){
					int ncost = now.cost+cost[i][v];
					int nbit = bit;
					if((bit>>i)%2==1)nbit=bit-(1<<i);
					if(memo[i][nbit]<=ncost)continue;
					memo[i][nbit] = ncost;
					q.add(new State(i, nbit, ncost));
				}
			}
		}

		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				cost = new int[n][n];
				for(int i=0;i<n-1;i++){
					int from = in.nextInt()-1;
					int to = in.nextInt()-1;
					cost[from][to] = cost[to][from] = in.nextInt();
				}
				dikstra();
				System.out.println(result);
			}
		}

		class State implements Comparable<State>{
			int bit,v,cost;
			public State(int v,int bit,int cost) {
				this.v = v;
				this.bit = bit;
				this.cost = cost;
			}
			public int compareTo(State o) {
				return this.cost - o.cost;
			}
			public String toString(){
				return Integer.toString(this.cost);
			}
		}

	}

}
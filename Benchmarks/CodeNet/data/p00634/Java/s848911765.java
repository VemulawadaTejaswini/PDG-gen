import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			ArrayList<HashMap<String,Integer>> market = new ArrayList<HashMap<String,Integer>>();
			for(int i=0;i<n;i++){
				int k = sc.nextInt();
				market.add(new HashMap<String,Integer>());
				for(int j=0;j<k;j++){
					String name = sc.next();
					int value = sc.nextInt();
					market.get(i).put(name,value);
				}
			}

			int q = sc.nextInt();
			int to = 1<<q;
			String[] list = new String[q];
			for(int i=0;i<q;i++){
				list[i] = sc.next();
			}

			int m = sc.nextInt();
			int[][] map = new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int s = sc.nextInt();
				int t = sc.nextInt();
				int d = sc.nextInt();
				map[s][t] = map[t][s] = d;
			}

			int[] bit = new int[n]; //eX[p[É©ªª¢½¢¤iª é©ÌtO
			for(int i=0;i<n;i++){
				for(String s : market.get(i).keySet()){
					int j = 0;
					for(;j<q;j++){
						if(list[j].equals(s)){
							break;
						}
					}
					if(j < q) bit[i] |= (1<<j);
				}
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			open.add(new State(0,0,0,0));
			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.id == 0 && st.bought == (1<<q)-1){
					ans = st;
					break;
				}

				//És­X[p[ðßé
				for(int i=0;i<=n;i++){
					if(map[st.id][i] > 0){
						if(i == 0){
							open.add(new State(i,st.bought,st.price,st.walk+map[st.id][i]));
							continue;
						}

						//ÇÌ¤ið¤©è
						for(int j=0;j<to;j++){
							if((st.bought & j) == 0 && (bit[i-1] & j) == j){
								int plus = 0;
								for(int k=0;k<q;k++){
									if(((1<<k) & j) > 0) plus += market.get(i-1).get(list[k]);
								}
								open.add(new State(i,st.bought|j,st.price+plus,st.walk+map[st.id][i]));
							}
						}
					}
				}
			}

			System.out.println(ans==null ? "impossible" : (ans.price + " " + ans.walk));
		}
	}
}

class State implements Comparable<State>{
	int id,bought,price,walk;

	State(int id,int bought,int price,int walk){
		this.id = id;
		this.bought = bought;
		this.price = price;
		this.walk = walk;
	}

	public int compareTo(State st){
		if(price == st.price) return walk - st.walk;
		return price - st.price;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return id == st.id && bought == st.bought;
	}

	public int hashCode(){
		return id + bought * 100;
	}
}
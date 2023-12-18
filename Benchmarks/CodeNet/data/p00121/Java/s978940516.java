import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			int[] t = new int[8];
			int[] g = new int[8];
			for(int i=0;i<8;i++){
				t[i] = sc.nextInt();
				g[i] = i;
			}

			Queue<State> open = new LinkedList<State>();
			HashSet<State> closed = new HashSet<State>();
			ArrayList<State> closedList = new ArrayList<State>();

			int ans = -1;
			open.add(new State(0,t,false));
			open.add(new State(0,g,true));

			while(!open.isEmpty()){
				State st = open.poll();

				if(closed.contains(st)){
					int idx = closedList.indexOf(st);
					State tmp = closedList.get(idx);

					if(tmp.d != st.d){
						ans = tmp.cost + st.cost;
						break;
					}
					else{
						continue;
					}
				}
				closed.add(st);
				closedList.add(st);

				open.addAll(st.nexts());
			}

			System.out.println(ans);
		}
	}
}

class State{
	int cost;
	int[] t;
	boolean d;

	State(int cost,int[] t,boolean d){
		this.cost = cost;
		this.t = new int[8];
		for(int i=0;i<8;i++) this.t[i] = t[i];
		this.d = d;
	}

	List<State> nexts(){
		int idx = -1;
		for(idx=0;t[idx]!=0;idx++);

		List<State> sts = new ArrayList<State>();
		if(idx >= 4){
			State st = new State(cost,t,d);
			st.t[idx-4] ^= st.t[idx];
			st.t[idx] ^= st.t[idx-4];
			st.t[idx-4] ^= st.t[idx];
			st.cost++;
			sts.add(st);
		}
		if(idx < 4){
			State st = new State(cost,t,d);
			st.t[idx+4] ^= st.t[idx];
			st.t[idx] ^= st.t[idx+4];
			st.t[idx+4] ^= st.t[idx];
			st.cost++;
			sts.add(st);
		}
		if(idx%4 > 0){
			State st = new State(cost,t,d);
			st.t[idx-1] ^= st.t[idx];
			st.t[idx] ^= st.t[idx-1];
			st.t[idx-1] ^= st.t[idx];
			st.cost++;
			sts.add(st);
		}
		if(idx%4 < 3){
			State st = new State(cost,t,d);
			st.t[idx+1] ^= st.t[idx];
			st.t[idx] ^= st.t[idx+1];
			st.t[idx+1] ^= st.t[idx];
			st.cost++;
			sts.add(st);
		}

		return sts;
	}

	public boolean equals(Object o){
		State st = (State)o;
		for(int i=0;i<8;i++) if(t[i] != st.t[i]) return false;
		return true;
	}

	public int hashCode(){
		int res = 0;
		for(int i=0;i<8;i++) res += t[i] * Math.pow(10,i);
		return res;
	}
}
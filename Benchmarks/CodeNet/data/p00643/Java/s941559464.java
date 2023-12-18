import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int h=sc.nextInt(), w=sc.nextInt();
			if(h==0 && w==0) break;
			int[][] map = new int[h][w];

			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
				}
			}

			int si=sc.nextInt(), sj=sc.nextInt();
			int gi=sc.nextInt(), gj=sc.nextInt();

			Queue<State> open = new PriorityQueue<State>();
			Set<State> closed = new HashSet<State>();

			State st = null;
			open.add(new State(0,new Dice(si,sj,1,6,4,3,5,2)));
			State ans = null;

			while(!open.isEmpty()){
				st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);
				if(st.d.i == gi && st.d.j == gj){
					ans = st;
					break;
				}
				open.addAll(st.nexts(map));
			}
			System.out.println(ans.cost);
		}
	}
}

class State implements Comparable<State>{
	int cost;
	Dice d;

	State(int cost,Dice d){
		this.cost = cost;
		this.d = d.copy();
	}

	List<State> nexts(int[][] map){
		List<State> sts = new ArrayList<State>();

		for(int i=0;i<4;i++){
			Dice dice = d.copy();
			if(dice.move(map,i)){
				sts.add(new State(cost+dice.b*map[dice.i][dice.j], dice));
			}
		}

		return sts;
	}

	public int compareTo(State st){
		return cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return this.d.equals(st.d);
	}

	public int hashCode(){
		return d.i + d.j + d.t + d.b + d.w + d.e + d.n + d.s;
	}
}

class Dice{
	int i,j;
	int t,b,w,e,n,s;

	Dice(int i,int j,int t,int b,int w,int e,int n,int s){
		this.i = i;
		this.j = j;
		this.t = t;
		this.b = b;
		this.w = w;
		this.e = e;
		this.n = n;
		this.s = s;
	}

	public boolean equals(Object dtmp){
		Dice d = (Dice)dtmp;
		return this.i == d.i && this.j == d.j &&
			this.t == d.t && this.b == d.b && this.w == d.w &&
			this.e == d.e && this.n == d.n && this.s == d.s;
	}

	boolean move(int[][] map,int d){
		Dice tmp = this.copy();

		switch(d){
		case 0:
			if(i-1<0) return false;
			i = i-1;
			t = tmp.s; b = tmp.n; n = tmp.t; s = tmp.b;
			break;
		case 1:
			if(j+1>=map[0].length) return false;
			j = j+1;
			t = tmp.w; b = tmp.e; w = tmp.b; e = tmp.t;
			break;
		case 2:
			if(i+1>=map.length) return false;
			i = i+1;
			t = tmp.n; b = tmp.s; n = tmp.b; s = tmp.t;
			break;
		case 3:
			if(j-1<0) return false;	
			j = j-1;
			t = tmp.e; b = tmp.w; w = tmp.t; e = tmp.b;
			break;
		}
		return true;
	}

	Dice copy(){
		return new Dice(i,j,t,b,w,e,n,s);
	}
}
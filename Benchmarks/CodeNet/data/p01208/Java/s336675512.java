import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			HashMap<String,Point> pmap = new HashMap<String,Point>();
			for(int i=0;i<n;i++){
				String name = sc.next();
				Point p = new Point(sc.nextInt(),sc.nextInt());
				pmap.put(name,p);
			}

			HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
			for(String name : pmap.keySet()){
				ArrayList<String> zeroList = new ArrayList<String>();
				for(int i=0;i<4;i++) zeroList.add(null);
				map.put(name,zeroList);
			}
			for(int i=0;i<m;i++){
				String s = sc.next();
				String d = sc.next();
				Point sp = pmap.get(s);
				Point dp = pmap.get(d);

				//ð·_ s ÌÉð·_ d ª é
				if(dp.x - sp.x > 0){
					map.get(s).set(1,d);
					map.get(d).set(3,s);
				}
				//ð·_ s Ì¼Éð·_ d ª é
				else if(dp.x - sp.x < 0){
					map.get(s).set(3,d);
					map.get(d).set(1,s);
				}
				//ð·_ s ÌkÉð·_ d ª é
				else if(dp.y - sp.y > 0){
					map.get(s).set(0,d);
					map.get(d).set(2,s);
				}
				//ð·_ s ÌìÉð·_ d ª é
				else {
					map.get(s).set(2,d);
					map.get(d).set(0,s);
				}
			}

			String s = sc.next();
			String d = sc.next();

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			for(int i=0;i<4;i++){
				open.add(new State(s,i,0,1));
			}

			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.name.equals(d)){
					ans = st;
					break;
				}

				//¼i
				String next = map.get(st.name).get(st.d);
				if(next != null){
					int dist = (int)pmap.get(st.name).distance(pmap.get(next));
					open.add(new State(next,st.d,st.dist+dist,st.cost+1));
				}

				//¶Ü
				int nd = (st.d + 3) % 4; //¶ÜÌûü
				next = map.get(st.name).get(nd);
				if(next != null){
					int dist = (int)pmap.get(st.name).distance(pmap.get(next));
					open.add(new State(next,nd,st.dist+dist,st.cost+1));
				}
			}

			System.out.println(ans == null ? "impossible" : ans.cost);
		}
	}
}

class State implements Comparable<State>{
	String name; //ð·_¼
	int d,dist,cost; //»Ýü¢Ä¢éûü,¡ÜÅà¢½£,ÊÁ½ð·_Ì

	State(String name,int d,int dist,int cost){
		this.name = name;
		this.d = d;
		this.dist = dist;
		this.cost = cost;
	}

	public int compareTo(State st){
		if(dist < st.dist) return -1;
		else if(dist > st.dist) return 1;
		return cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return name.equals(st.name) && d == st.d;
	}

	public int hashCode(){
		return name.hashCode() + d;
	}
}
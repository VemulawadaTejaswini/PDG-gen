import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		String name;
		int cost, n;
		State(String name, int cost, int n){
			this.name=name;
			this.cost=cost;
			this.n=n;
		}
		public int compareTo(State s) {
			if(s.cost==this.cost) {
				return this.n-s.n;
			}//辞書昇順
                        else
			return s.cost-this.cost;
		}//収入効率降順
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				PriorityQueue<State> pq=new PriorityQueue<State>();
				ArrayList<String> list=new ArrayList<>();
				Map<String, Integer> map=new HashMap<>();
				for(int i=0; i<N; i++) {
					String name=sc.next();
					int p=sc.nextInt();
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					int e=sc.nextInt();
					int f=sc.nextInt();
					int s=sc.nextInt();
					int m=sc.nextInt();
					int turn1=a+b+c;
					int turn2=d+e;
					int benefit=f*s*m-p;//利益計算
					int cost=benefit*10000/(turn1+m*turn2);//収入効率計算
					list.add(name);
					map.put(name, cost);
				}
				Collections.sort(list);//ソートして辞書昇順に
				for(int i=0; i<N; i++){
					String name=list.get(i);
					pq.add(new State(name, map.get(name), i));
				}
				for(int i=0; i<N; i++) {
					State st=pq.remove();
					System.out.println(st.name);
				}
				System.out.println("#");
			}


		}
	}
}

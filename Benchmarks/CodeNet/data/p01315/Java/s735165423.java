import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		String name;
		int cost;
		State(String name, int cost){
			this.name=name;
			this.cost=cost;
		}
		public int compareTo(State s) {
			return s.cost-this.cost;
		}
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				PriorityQueue<State> pq=new PriorityQueue<State>();
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
					int turn1=a+b+c+d+e;
					int turn2=d+e;
					int benefit=f*s*m-p;
					int cost=benefit*10000/(turn1+(m-1)*turn2);
					pq.add(new State(name, cost));
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

import java.util.*;

public class Main{
	public static void main(String[] args){
		int i;
		Scanner sc = new Scanner(System.in);
		PriorityQueue<State>
			a = new PriorityQueue<State>(),
			b = new PriorityQueue<State>(),
			c = new PriorityQueue<State>();

		for(i=0;i<8;i++) a.add(new State(sc.nextInt(),sc.nextDouble()));
		for(i=0;i<8;i++) b.add(new State(sc.nextInt(),sc.nextDouble()));
		for(i=0;i<8;i++) c.add(new State(sc.nextInt(),sc.nextDouble()));

		for(i=0;i<2;i++) System.out.println(a.poll());
		for(i=0;i<2;i++) System.out.println(b.poll());
		for(i=0;i<2;i++) System.out.println(c.poll());

		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.addAll(a);
		pq.addAll(b);
		pq.addAll(c);

		for(i=0;i<2;i++) System.out.println(pq.poll());
	}
}

class State implements Comparable<State>{
	int n;
	double t;

	State(int n, double t){
		this.n = n;
		this.t = t;
	}

	public int compareTo(State st){
		if(this.t < st.t) return -1;
		else if(this.t == st.t) return 0;
		else return 1;
	}

	public String toString(){
		return String.format("%d %.2f",n,t);
	}
}
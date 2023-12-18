import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		int num, fish;
		State(int num, int fish){
			this.num=num;
			this.fish=fish;
		}
		public boolean equals(Object s) {
			return this.num==((State)s).num;
		}
		public int compareTo(State s) {
			if(this.fish==s.fish) return this.num-s.num;
			else return s.fish-this.fish;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int q=sc.nextInt();
			int[] a=new int[n+1];
			PriorityQueue<State> pq=new PriorityQueue<>();
			while(q-->0) {
				int b=sc.nextInt();
				int c=sc.nextInt();
				a[b]+=c;
				pq.add(new State(b, a[b]));
				while(!pq.isEmpty()) {
					State top=pq.element();
					if(top.fish==a[top.num]) {
						System.out.println(top.num+" "+top.fish);
						break;
					}
					pq.poll();
				}
			}

		}

	}
}

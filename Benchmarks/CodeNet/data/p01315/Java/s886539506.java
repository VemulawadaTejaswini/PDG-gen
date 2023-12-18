import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			PriorityQueue<State> pq = new PriorityQueue<State>();
			for(int i=0;i<n;i++){
				pq.add(new State(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
			}

			while(!pq.isEmpty()){
				System.out.println(pq.poll().l);
			}
			System.out.println("#");
		}
	}
}

class State implements Comparable<State>{
	String l;
	int p,a,b,c,d,e,f,s,m;
	double per;

	State(String l,int p,int a,int b,int c,int d,int e,int f,int s,int m){
		this.l = l;
		this.p = p;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.s = s;
		this.m = m;

		this.per = calcPer();
	}

	double calcPer(){
		return ((double)f*m*s-p) / (double)calcTime();
	}

	int calcTime(){
		return a + b + c + (d + e) * m;
	}

	public int compareTo(State st){
		if(this.per < st.per){
			return 1;
		}
		else if(this.per > st.per){
			return -1;
		}
		else{
			return this.l.compareTo(st.l);
		}
	}
}
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int ans=0;
			int n=sc.nextInt(), m=sc.nextInt();
			ArrayList<State> al = new ArrayList<State>();

			if(n==0 && m==0) break;
			for(int i=0;i<n;i++)
				al.add(new State(sc.nextInt(), sc.nextInt()));
			Collections.sort(al);

			while(!al.isEmpty()){
				State st = al.remove(0);
				m -= st.d;
				if(m <= 0){
					ans -= m * st.p;
					break;
				}
			}

			while(!al.isEmpty()){
				State st = al.remove(0);
				ans += st.d * st.p;
			}
			System.out.println(ans);
		}
	}
}

class State implements Comparable<State>{
	int d, p;

	public State(int d, int p){
		this.d = d;
		this.p = p;
	}

	public int compareTo(State st){
		return st.p - this.p;
	}
}
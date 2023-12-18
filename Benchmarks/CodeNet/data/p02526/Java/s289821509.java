import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ10031().doIt();
	}
	
	class AOJ10031{
		
		void solve(){
			int n = in.nextInt();
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i=0;i<n;i++)set.add(in.nextInt());
			int q = in.nextInt();
			int cnt = 0;
			for(int i=0;i<q;i++)if(set.contains(in.nextInt()))cnt++;
			System.out.println(cnt);
		}
		
		void doIt(){
			while(in.hasNext())solve();
		}
	}
	
}
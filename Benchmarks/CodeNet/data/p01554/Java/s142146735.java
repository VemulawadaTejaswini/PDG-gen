import java.util.*;

class Main{
	public static void main(String args[]){
		Solve s = new Solve();
		s.solve();
	}
}

class Solve{
	Scanner in = new Scanner(System.in);

	void solve(){
		int n = in.nextInt();
		Set<String> st = new HashSet<String>();
		for(int i = 0; i< n; i++) {
			String str = in.next();
			st.add(str);
		}
		boolean open = false;
		int m = in.nextInt();
		for(int i = 0; i< m; i++){
			String str = in.next();
			if(st.contains(str)) {
				if(open) System.out.println("Closed by " + str);
				else System.out.println("Opened by " + str);
				open = !open;
			}
			else System.out.println("Unknown " + str);
		}
	}
}
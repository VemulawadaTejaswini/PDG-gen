import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		int n = in.nextInt();
		int[] p = new int[n];
		int[][] d = new int[n][3];

		for(int i = 0; i < n; i++){
			for(int  j = 0; j < 3; j++){
				d[i][j] = in.nextInt();
			}
		}

		for(int j = 0; j < 3; j++) {
			Map<Integer,Integer> m = new HashMap<>();
			for(int i = 0; i < n; i++){
				if(m.get(d[i][j]) == null) m.put(d[i][j], 1);
				else m.put(d[i][j],m.get(d[i][j]) + 1);
			}
			for(int i = 0; i < n; i++){
				if(m.get(d[i][j]) == 1) p[i] += d[i][j];
			}
		}

		for(int i = 0; i < n; i++){
			System.out.println(p[i]);
		}
	}

	
	
}
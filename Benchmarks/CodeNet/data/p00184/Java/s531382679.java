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
		int[] a = {10,20,30,40,50,60};
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) return;

			int[] b = new int[7];
			for(int i = 0; i < n; i++) {
				int c = in.nextInt();
				for(int j = 0; j < 6; j++){
					if(c < a[j]) {
						b[j]++;
						break;
					}
					if(j == 5) b[6]++;
				}
			}

			for(int i = 0; i < 7; i++) {
				System.out.println(b[i]);
			}
		}
	}

	
}
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
		int[] a = {1,5,10,50,100,500};
		int[] b = new int[6];

		int sum = 0;

		for(int i = 0; i < 6; i++){
			b[i] = in.nextInt();
			sum += b[i] * a[i];
		}

		int ans = (sum < 1000 ? 0 :1);

		System.out.println(ans);
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }
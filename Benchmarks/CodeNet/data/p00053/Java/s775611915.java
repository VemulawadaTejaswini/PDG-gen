import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static final int N = 10000;
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		// メモ化みたいな
		ArrayList<Long> p = new ArrayList<Long>();
		for(long i=2; p.size()<=N; ++i){
			boolean f = true;
			for(int j=0; j<p.size(); ++j){
				// いままでの素数で試し割り
				f &= i%p.get(j)!=0;
				if(!f) break;
			}
			if(f){
				p.add(i);
			}
		}
		
		while(true){
			int n = sc.nextInt();
			
			if(n==0) break;
			
			int sum = 0;
			
			for(int i=0; i<n; ++i){
				sum += p.get(i);
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}
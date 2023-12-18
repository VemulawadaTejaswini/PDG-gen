import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	// Math
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			long n = Long.parseLong(sc.next());
			if(n==0) break;
			
//			int cnt2 = 0;
			int cnt5 = 0;
//			for(long i=n; i>=2; cnt2+=i/2, i/=2);
			for(long i=n; i>=5; cnt5+=i/5, i/=5);
			
//			System.out.println(Math.min(cnt2, cnt5));
			System.out.println(cnt5);
		}
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}
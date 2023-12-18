import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int X = Integer.parseInt(sc.next(), 2);
		
		for(int i=0; i<N; i++) {
			pw.println(f(X^(1<<(N-1-i))));
		}
		
		pw.close();
		sc.close();
	}
	
	static int f(int x) {
		int ans = 0;
		while(x>0) {
			x = x%popcount(x);
			ans++;
		}
		return ans;
	}
	
	static int popcount(int x) {
		int ans = 0;
		while(x>0) {
			ans += x&1;
			x>>=1;
		}
		return ans;
	}
}

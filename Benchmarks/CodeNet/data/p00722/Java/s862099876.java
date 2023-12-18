
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean isPrime[];
	int MAX = 1000000;
	void run() {
		isPrime = new boolean[MAX];
		isPrime[0] = isPrime[1] = true;
		er();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if((a|d|n) == 0) break;
			for(int i=0;i<n;a+=d) {
				if(!isPrime[a]) i++;
			}
			System.out.println(a-d);
		}
		
	}
	
	void er() {
		for(int i=2;i<MAX;i++) {
			if(!isPrime[i])
				for(int j=i*2;j<MAX;j+=i) isPrime[j] = true;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
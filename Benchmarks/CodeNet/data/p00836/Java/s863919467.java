
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MAX = 10000;
	void run() {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[MAX+1];
		boolean[] isp = new boolean[MAX+1];
		isp[0] = isp[1] = true;
		ArrayList<Integer> ps = new ArrayList<Integer>();
		for(int i=2;i<=MAX;i++) if(!isp[i]) {
			for(int j=i*2;j<=MAX;j+=i) isp[j] = true;
			ps.add(i);
		}
		
		int[] sum = new int[ps.size()+1];
		for(int i=1;i<=ps.size();i++) sum[i] = sum[i-1] + ps.get(i-1);
		for(int i=0;i<=ps.size()-1;i++) for(int j=i+1;j<=ps.size();j++) {
			if(sum[j]-sum[i] <= MAX) cnt[sum[j]-sum[i]]++;
		}
		
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(cnt[n]);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
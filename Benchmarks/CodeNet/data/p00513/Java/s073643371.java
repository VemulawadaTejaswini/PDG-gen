
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt=0;
		for(long i=0;i<n;i++) {
			if(!isAllow(sc.nextInt())) cnt++;
		}
		System.out.println(cnt);
	}
	
	boolean isAllow(long S) {
		for(long i=1;i*i<S;i++) {
			if((S-i)%(2*i+1) == 0) return true;
		}
		return false;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
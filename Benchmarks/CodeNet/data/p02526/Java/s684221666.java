
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<n;i++) set.add(sc.nextInt());
		
		int q = sc.nextInt(), cnt = 0;
		for(int i=0;i<q;i++) if(set.contains(sc.nextInt())) cnt++;
		System.out.println(cnt);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
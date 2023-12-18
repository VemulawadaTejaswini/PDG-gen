
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
		int n = sc.nextInt(); sc.nextLine();
		boolean flg = true;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String[] s = sc.nextLine().split(" ");
			if( s[0].equals("(") ) cnt += Integer.parseInt(s[1]);
			if( s[0].equals(")") ) cnt -= Integer.parseInt(s[1]);
			if( cnt < 0 ) flg = false;
		}
		if( flg && cnt == 0 ) System.out.println("YES");
		else System.out.println("NO");
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
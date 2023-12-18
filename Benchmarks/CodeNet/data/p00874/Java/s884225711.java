
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int H = 20;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt(), d = sc.nextInt();
			if((w|d) == 0) break;
			
			int[] ws = new int[w], ds = new int[d];
			for(int i=0;i<w;i++) ws[i] = sc.nextInt();
			for(int i=0;i<d;i++) ds[i] = sc.nextInt();
			sort(ws); sort(ds);
			int i, j, cnt = 0;
			for(i=j=0;i!=w&&j!=d;) {
				if(ws[i] == ds[j])     {cnt+=ws[i]; i++; j++; }
				else if(ws[i] < ds[j]) {cnt+=ws[i]; i++;}
				else                   {cnt+=ds[j]; j++;}
			}
			for(;i<w;i++) cnt+=ws[i];
			for(;j<d;j++) cnt+=ds[j];
			System.out.println(cnt);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	static boolean[] hamming = new boolean[1000001];
	static short[] hcnt = new short[1000001];

	public static void main(String[] args) {
		hamming(0,0,0);
		int cnt = 0;
		for (int i = 0; i < 1000000 ; i++) {
			if(hamming[i]) cnt++;
			hcnt[i] = (short)cnt;
		}
		while(true){
			int p = si();
			if(p==0) break;
			int q = si();

			out.println(hcnt[q]-hcnt[p-1]);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}

	static void hamming(int p,int q,int r){
		int n = (int)(pow(2,p)*pow(3,q)*pow(5,r));
		if(n>1000000) return;
		hamming[n]=true;
		hamming(p+1,q,r);
		hamming(p,q+1,r);
		hamming(p,q,r+1);
	}
}
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	static int INF = 2 << 27;
	static int[] vx = {1,0,-1,0};
	static int[] vy = {0,1,0,-1};
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(p == 0 && q == 0) break;
			int[][] r = new int[p+1][2];
			int[][] c = new int[p+1][2];
			int[][] s = new int[p+1][2];
			int[] n = new int[p+1];
			
			for(int i = 0; i < p; i++) {
				char[] in = sc.next().toCharArray();
				for(int j = 0; j < 2; j++) {
					r[i+1][j] = r[i][j];
					c[i+1][j] = c[i][j];
					s[i+1][j] = s[i][j];
				}
				boolean al = true;
				for(int j = 0; j < in.length; j++) {
					if(al) {
						if(in[j] == '.') {
							n[i]++;
						}
						else {
							al = false;
						}
					}
					if(in[j] == '(') r[i+1][0]++;
					if(in[j] == ')') r[i+1][0]--;
					if(in[j] == '{') c[i+1][0]++;
					if(in[j] == '}') c[i+1][0]--;
					if(in[j] == '[') s[i+1][0]++;
					if(in[j] == ']') s[i+1][0]--;
				}
			}
			ArrayList<Integer> rr = new ArrayList<Integer>();
			ArrayList<Integer> cc = new ArrayList<Integer>();
			ArrayList<Integer> ss = new ArrayList<Integer>();
			for(int i = 1; i <= 20; i++) {
				for(int j = 1; j <= 20; j++) {
					IN:for(int k = 1; k <= 20; k++) {
						for(int l = 0; l < p+1; l++) {
							int aa = i * r[l][0] + j * c[l][0] + k * s[l][0];
							if(aa != n[l]) {
								continue IN;
							}
						}
						rr.add(i);
						cc.add(j);
						ss.add(k);
					}
				}
			}
			int rrr = 0;
			int ccc = 0;
			int sss = 0;
			for(int i = 0; i < q; i++) {
				
				int sum = -2;
				for(int j = 0; j < rr.size(); j++) {
					int ll = rrr * rr.get(j) + ccc * cc.get(j) + sss * cc.get(j);
					if(sum != -2 && sum != ll) sum = -1;
					else if(sum == -2) sum = ll;
				}
				
				if(sum == -2) sum = -1;
				if(i != 0) System.out.print(" ");
				System.out.print(sum);
				if(i != q) {
					char[] in = sc.next().toCharArray();
					for(int j = 0; j < in.length; j++) {
						if(in[j] == '(') rrr++;
						if(in[j] == ')') rrr--;
						if(in[j] == '{') ccc++;
						if(in[j] == '}') ccc--;
						if(in[j] == '[') sss++;
						if(in[j] == ']') sss--;
					}
				}
				
			}
			System.out.println();
			
			
		}
	}
}
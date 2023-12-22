import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    public void solve() {
    	char[] S = nc();
    	int A = Integer.valueOf(String.valueOf(S[0]));
    	int B = Integer.valueOf(String.valueOf(S[1]));
    	int C = Integer.valueOf(String.valueOf(S[2]));
    	int D = Integer.valueOf(String.valueOf(S[3]));
    	int wk;
    	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					wk = A;
					if(i == 0)	wk += B;
					else		wk -= B;
					if(j == 0)	wk += C;
					else		wk -= C;
					if(j2 == 0)	wk += D;
					else		wk -= D;
					if(wk == 7) {
						out.println(A + (i==0?"+":"-") 
								+ B + (j==0?"+":"-")
								+ C + (j2==0?"+":"-")
								+ D + "=7");
						return;
					}
				}
			}
		}
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return Integer.parseInt(sc.next());
    }
    public long nl() {
    	return Long.parseLong(sc.next());
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] ndii(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}

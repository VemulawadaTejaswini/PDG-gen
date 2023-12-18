import java.util.*;

import javax.xml.crypto.Data;

import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int W;
	static int H;
	static int N;
	static boolean[][] fld;
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	static int id;
	static int P;
	static int Q;
	static int R;
	static String S;
	static int[][] A = new int[][] {{0,1,2},{1,1,2},{2,2,2}};
	static int[][] B = new int[][] {{0,0,0},{0,1,1},{0,1,2}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String in = sc.next();
			if(in.equals(".")) break;
			S = in;
			id = 0;
			int count = 0;
			for(P = 0; P < 3; P++) {
				for(Q = 0; Q < 3; Q++) {
					for(R = 0; R < 3; R++) {
						id = 0;
						int ans = formula();
						if(ans == 2) count++;
					}
				}
			}
			System.out.println(count);
			
		}
	}
	static int formula() {
		if(id == S.length()) return 0;
		if(S.charAt(id) == '0') {
			id++;
			return 0;
		}
		if(S.charAt(id) == '1') {
			id++;
			return 1;
		}
		if(S.charAt(id) == '2') {
			id++;
			return 2;
		}
		if(S.charAt(id) == 'P') {
			id++;
			return P;
		}
		if(S.charAt(id) == 'Q') {
			id++;
			return Q;
		}
		if(S.charAt(id) == 'R') {
			id++;
			return R;
		}
		if(S.charAt(id) == '-') {
			id++;
			int ret = formula();
			if(ret == 0) {
				return 2;
			}
			if(ret == 1) {
				return 1;
			}
			if(ret == 2) {
				return 0;
			}
		}
		if(S.charAt(id) == '(') {
			id++;
			int A = formula();
			char K = S.charAt(id);
			id++;
			int B = formula();
			id++;
			if(K == '*') {
				return(Main.B[A][B]);
			}
			else if(K == '+') {
				return Main.A[A][B];
			}
		}
		
		
		return 0;
		
		
		
	}
}
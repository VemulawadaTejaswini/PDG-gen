import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.Data;

import java.util.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) break;
			char[][] map = new char[y][x];
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					map[i][j] = sc.next().toCharArray()[0];
				}
			}
			int ans = 0;
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			ArrayList<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(0,0));
			Data tmp = new Data(list,new boolean[y][x],0,map[0][0]);
			queue.add(tmp);
			while(!queue.isEmpty()) {
				Data p = queue.poll();
				dfs(p.list,p.al,map,p.S);
				if(p.list.isEmpty()) {
					ans = p.count;
					queue.clear();
					break;
				}
				for(int j = 0; j < 3; j++) {
					if(p.S == C[j]) continue;
					ArrayList<Pair> nextAL = new ArrayList<Pair>(p.list);
					boolean[][] next = new boolean[p.al.length][];
					for(int k = 0; k < next.length; k++) {
						next[k] = Arrays.copyOf(p.al[k], p.al[k].length);
					}
					queue.add(new Data(nextAL,next,p.count+1,C[j]));
				}
			}
			System.gc();
			System.out.println(ans);
		}
	}
	static int[] vx = {0,1,0,-1};
	static int[] vy = {1,0,-1,0};
	static char[] C = {'R','G','B'};
	static void dfs(ArrayList<Pair> a, boolean[][] b, char[][] c, char d) {
		for(int i = 0; i < a.size(); i++) {
			if(c[a.get(i).y][a.get(i).x] == d) {
				b[a.get(i).y][a.get(i).x] = true;
				for(int j = 0; j < 4; j++) {
					int ty = vy[j] + a.get(i).y;
					int tx = vx[j] + a.get(i).x;
					if(ty < 0 || tx < 0 || ty >= c.length || tx >= c[ty].length || b[ty][tx]) continue;
					a.add(new Pair(ty,tx));
				}
				a.remove(i);
				i--;
			}
		}
	}
	static class Data {
		int count;
		ArrayList<Pair> list;
		boolean[][] al;
		char S;
		Data(ArrayList<Pair> a, boolean[][] b, int c, char d) {
			list = a;
			al = b;
			count = c;
			S = d;
		}
	}
	static class Pair {
		int y;
		int x;
		Pair(int a, int b) {
			y = a;
			x = b;
		}
	}
	
	
	
}
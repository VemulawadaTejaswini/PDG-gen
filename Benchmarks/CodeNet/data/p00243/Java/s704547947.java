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
			int ans = 10;
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			ArrayList<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(0,0));
			Data tmp = new Data(list,new boolean[y][x],0,map[0][0]);
			queue.add(tmp);
			while(!queue.isEmpty()) {
				Data p = queue.poll();
				if(p.count >= ans) continue;
				boolean ok = false;
				for(int i = 0; i < p.list.size(); i++) {
					if(map[p.list.get(i).y][p.list.get(i).x] == p.S) {
						p.al[p.list.get(i).y][p.list.get(i).x] = true;
						ok = true;
						for(int j = 0; j < 4; j++) {
							int ty = vy[j] + p.list.get(i).y;
							int tx = vx[j] + p.list.get(i).x;
							if(ty < 0 || tx < 0 || ty >= map.length || tx >= map[ty].length || p.al[ty][tx]) continue;
							
							p.list.add(new Pair(ty,tx));
						}
						p.list.remove(i);
						i--;
					}
				}
				if(!ok) continue;
				if(p.list.isEmpty()) {
					ans = p.count;
					break;
				}
				for(int j = 0; j < 3; j++) {
					if(p.S == C[j]) continue;
					ArrayList<Pair> nextAL = new ArrayList<Pair>(p.list);
					boolean[][] next = new boolean[p.al.length][];
					for(int k = 0; k < next.length; k++) {
						next[k] = Arrays.copyOf(p.al[k], p.al[k].length);
					}
					queue.addLast(new Data(nextAL,next,p.count+1,C[j]));
				}
			}
			System.out.println(ans);
		}
	}
	static final int[] vx = {0,1,0,-1};
	static final int[] vy = {1,0,-1,0};
	static final char[] C = {'R','G','B'};

	
	static class Data {
		int count;
		ArrayList<Pair> list;
		boolean[][] al;
		char S;
		int r;
		int g;
		int b;
		
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
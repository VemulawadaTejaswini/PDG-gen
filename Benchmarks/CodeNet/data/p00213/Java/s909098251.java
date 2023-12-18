import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
	static int[][] now;
	static int[][] map;
	static int[][] ans;
	static int x;
	static int y;
	static int n;

	static boolean ok;
	static boolean na;

	static HashMap<Integer,Integer> MAP = new HashMap<Integer,Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			MAP.clear();
			x = sc.nextInt();
			y = sc.nextInt();
			n = sc.nextInt();
			ok = false;
			na = false;
			if(x == 0 && y == 0 && n == 0) break;
			for(int i = 0; i < n; i++) {
				int b = sc.nextInt();
				int k = sc.nextInt();
				MAP.put(b, k);
			}
			map = new int[y][x];
			now = new int[y][x];
			ans = new int[y][x];
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			solv(0,0,0);
			if(!ok) {
				System.out.println("NA");
				continue;
			}
			for(int i = 0; i < y; i++) {
				System.out.print(ans[i][0]);
				for(int j = 1; j < x; j++) {
					System.out.print(" " + ans[i][j]);
				}
				System.out.println();
			}
		}
	}
	static void solv(int y, int x, int cc) {
		/*
		System.out.println("==");
		for(int i = 0; i < Main.y; i++) {
			for(int j = 0; j < Main.x; j++) {
				System.out.print(" " + now[i][j]);
			}
			System.out.println();
		}
		*/
		if(na) return;
		if(x == Main.x) {
			x = 0;
			y++;
		}
		if(y == Main.y && !ok && !na && check(cc)) {
			ok = true;
			for(int i = 0; i < Main.y; i++) {
				ans[i] = Arrays.copyOf(now[i], now[i].length);
			}
			return;
		}
		else if(y == Main.y && ok && check(cc)) {
			ok = false;
			na = true;
			return;
		}
		else if(y == Main.y) {
			return;
		}
		for(int CX = 1; CX <= MAP.size(); CX++) {
			if((cc & (1 << (CX-1))) != 0) continue;
			IN:for(int i = MAP.get(CX); i >= 1; i--) {
				if(MAP.get(CX) % i != 0) continue;
				boolean check = false;
				for(int k = 0; k < i; k++) {
					for(int l = 0; l < MAP.get(CX)/i; l++) {
						int ty = y+k;
						int tx = x+l;
						if(ty < 0 || tx < 0 || ty >= Main.y || tx >= Main.x) continue IN;
						if(now[ty][tx] != 0 || (map[ty][tx] != CX && map[ty][tx] != 0)) continue IN;
						if(map[ty][tx] == CX) check = true;
					}
				}
				if(!check) continue;
				for(int k = 0; k < i; k++) {
					for(int l = 0; l < MAP.get(CX)/i; l++) {
						int ty = y+k;
						int tx = x+l;
						now[ty][tx] = CX;
					}
				}
				solv(y,x+1,(cc | (1 << (CX-1))));
				for(int k = 0; k < i; k++) {
					for(int l = 0; l < MAP.get(CX)/i; l++) {
						int ty = y+k;
						int tx = x+l;
						now[ty][tx] = 0;
					}
				}
			}
		}
		solv(y,x+1,cc);
	}
	
	static boolean check(int a) {
		for(int i = 0; i < MAP.size(); i++) {
			if((a & (1 << i)) == 0) return false;
		}
		return true;
	}




}
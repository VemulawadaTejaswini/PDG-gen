import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int[][] list;
	static int X;
	static int Y;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			list = new int[2][4];
			stack.clear();
			arL.clear();
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 4; j++) {
					list[i][j] = stdIn.nextInt();
					if(list[i][j] == 0) {
						X = j;
						Y = i;
					}
				}
			}
			System.out.println(solv());
		}
	}
	static ArrayDeque<Data> stack = new ArrayDeque<Data>();

	static class Data{
		int[][] a;
		int b;
		int y;
		int x;
		Data(int[][] a, int b, int y, int x) {
			this.a = a;
			this.b = b;
			this.y = y;
			this.x = x;
		}
		public boolean equals(Object b) {
			Data a = (Data)b;
			if(this.x != a.x) return false;
			if(this.y != a.y) return false;
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 4; j++) {
					if(this.a[i][j] != a.a[i][j]) return false;
				}
			}
			return true;
		}
		
	}
	
	public static int solv() {
		stack.addLast(new Data(list,0,Y,X));
		while(true) {
			Data tmp = stack.pollFirst();
			int a = dfs(tmp);
			if(a != -1) {
				return a;
			}
		}
	}
	static ArrayList<Data> arL = new ArrayList<Data>();
	public static int dfs(Data data) {
		if(check(data.a)) return data.b;
		Data cx = new Data(data.a,0,data.y,data.x);
		if(arL.contains(cx)) return -1;
		else {
			arL.add(cx);
		}
		int[][] tm = new int[2][4];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				tm[i][j] = data.a[i][j];
			}
		}
		
		Data tmp = new Data(tm, data.b+1, data.y, data.x);
		//上
		if(tmp.y == 1) {
			int ck = tmp.a[tmp.y][tmp.x];
			tmp.a[tmp.y][tmp.x] = tmp.a[tmp.y-1][tmp.x];
			tmp.a[tmp.y-1][tmp.x] = ck;
			tmp.y = 0;
			stack.addLast(tmp);
		}
		//下
		tm = new int[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				tm[i][j] = data.a[i][j];
			}
		}
		tmp = new Data(tm, data.b+1, data.y, data.x);
		if(tmp.y == 0) {
			int ck = tmp.a[tmp.y][tmp.x];
			tmp.a[tmp.y][tmp.x] = tmp.a[tmp.y+1][tmp.x];
			tmp.a[tmp.y+1][tmp.x] = ck;
			tmp.y = 1;
			stack.addLast(tmp);
		}
		//右
		tm = new int[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				tm[i][j] = data.a[i][j];
			}
		}
		tmp = new Data(tm, data.b+1, data.y, data.x);
		if(tmp.x != 3) {
			int ck = tmp.a[tmp.y][tmp.x];
			tmp.a[tmp.y][tmp.x] = tmp.a[tmp.y][tmp.x+1];
			tmp.a[tmp.y][tmp.x+1] = ck;
			tmp.x++;
			stack.addLast(tmp);
		}
		//左
		tm = new int[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				tm[i][j] = data.a[i][j];
			}
		}
		tmp = new Data(tm, data.b+1, data.y, data.x);
		if(tmp.x != 0) {
			int ck = tmp.a[tmp.y][tmp.x];
			tmp.a[tmp.y][tmp.x] = tmp.a[tmp.y][tmp.x-1];
			tmp.a[tmp.y][tmp.x-1] = ck;
			tmp.x--;
			stack.addLast(tmp);
		}
		
		
		return -1;
	}
	public static boolean check(int[][] a) {
		int count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				if(a[i][j] != count++) return false;
			}
		}
		return true;
	}
}
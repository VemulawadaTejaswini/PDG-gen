import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	static HashMap<String,Integer> map2 = new HashMap<String,Integer>();
	static int min = 21;
	static int[][] move = new int[][] {
								{2},
					   {2,5},{0,1,3,6},{2,7},
			   {5},{1,4,6,9},{2,5,7,10},{3,6,8,11},{7},
			          {5,10},{6,9,11,12},{7,10},
			          			{10}
			          };
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = "0123456789AB0";
		Bfsa(0,0,12,first);
		IN:while(true) {
			min = 21;
			char[] data = new char[13];
			int xa = -1;
			int xb = -1;
			for(int i = 0; i < 13; i++) {
				String tmp = sc.next();
				if(tmp.equals("-1")) break IN;
				if(tmp.equals("10")) tmp = "A";
				if(tmp.equals("11")) tmp = "B";
				if(tmp.equals("0")) {
					if(xa == -1) xa = i;
					else xb = i;
				}
				data[i] = tmp.charAt(0);
			}
			if(map.containsKey(String.valueOf(data))) {
				min = map.get(String.valueOf(data));
			}
			Bfsb(0,xa,xb,String.valueOf(data));
			if(min <= 20) {
				System.out.println(min);
			}
			else {
				System.out.println("NA");
			}
			
		}
	}
	static ArrayDeque<Data> queue = new ArrayDeque<Data>();
	
	static void Bfsa(int a, int b, int c,String d) {
		queue.clear();
		queue.add(new Data(a,b,c,d));
		while(!queue.isEmpty()) {
			Data ax = queue.poll();
			bfsa(ax.a,ax.b1,ax.b2,ax.d);
		}
	}
	
	static void Bfsb(int a, int b, int c,String d) {
		queue.clear();
		queue.add(new Data(a,b,c,d));
		while(!queue.isEmpty()) {
			Data ax = queue.poll();
			bfsb(ax.a,ax.b1,ax.b2,ax.d);
		}
	}
	
	
	static String swap(int a, int b, String c) {
		char[] x = c.toCharArray();
		char tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
		String cx = String.valueOf(x);
		return cx;
	}
	static void bfsa(int a, int b1,int b2, String c) {
		if(a >= 10) return;
		if(!map.containsKey(c)) {
				map.put(c, a);
		}
		else {
			return;
		}
		for(int i = 0; i < 13; i++) {
			if(b1 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b2) {
						c = swap(b2,b1,c);
						queue.add(new Data(a,b2,b1,c));
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b1,c);
						queue.add(new Data(a+1,move[i][j],b2,c));
						c = swap(move[i][j],b1,c);
					}
				}
			}
			if(b2 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b1) {
						c = swap(b2,b1,c);
						queue.add(new Data(a,b2,b1,c));
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b2,c);
						queue.add(new Data(a+1,b1,move[i][j],c));
						c = swap(move[i][j],b2,c);
					}
				}
			}
		}
	}
	
	static void bfsb(int a, int b1,int b2, String c) {
		if(a >= 10) return;
		if(!map2.containsKey(c)) {
			if(map.containsKey(c)) {
				min = Math.min(min, a + map.get(c));
			}
			map2.put(c, a);
		}
		else {
			return;
		}
		for(int i = 0; i < 13; i++) {
			if(b1 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b2) {
						c = swap(b2,b1,c);
						queue.add(new Data(a,b2,b1,c));
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b1,c);
						queue.add(new Data(a+1,move[i][j],b2,c));
						c = swap(move[i][j],b1,c);
					}
				}
			}
			if(b2 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b1) {
						c = swap(b2,b1,c);
						queue.add(new Data(a,b2,b1,c));
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b2,c);
						queue.add(new Data(a+1,b1,move[i][j],c));
						c = swap(move[i][j],b2,c);
					}
				}
			}
		}
	}
	
	static class Data {
		int a, b1, b2 ;
		String d;
		Data(int a, int b, int c, String d) {
			this.a = a;
			b1 = b;
			b2 = c;
			this.d = d;
		}
	}
	

}
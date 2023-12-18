import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	static int[][] move = new int[][] {
								{2},
					   {2,5},{0,1,3,6},{2,7},
			   {5},{1,4,6,9},{2,5,7,10},{3,6,8,11},{7},
			          {5,10},{6,9,11,12},{7,10},
			          			{10}
			          };
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] first = new char[] { '0','1','2','3','4','5','6','7','8','9','A','B','0'};
		
		dfs(0,0,12,first);
		
		IN:while(true) {
			char[] data = new char[13];
			for(int i = 0; i < 13; i++) {
				String tmp = sc.next();
				if(tmp.equals("-1")) break IN;
				if(tmp.equals("10")) tmp = "A";
				if(tmp.equals("11")) tmp = "B";
				data[i] = tmp.charAt(0);
			}
			if(map.containsKey(String.valueOf(data))) {
				System.out.println(map.get(String.valueOf(data)));
			}
			else {
				System.out.println("NA");
			}
			
		}
	}
	static void swap(int a, int b, char[] c) {
		char tmp = c[a];
		c[a] = c[b];
		c[b] = tmp;
	}
	static void dfs(int a, int b1,int b2, char[] c) {
		StringBuilder tmp = new StringBuilder(String.valueOf(c));
		if(a >= 20) return;
		String s = tmp.toString();
		if(map.containsKey(s)) {
			if(map.get(s) <= a) {
				return;
			}
			else {
				map.put(s, a);
			}
		}
		else {
			map.put(s, a);
		}
		for(int i = 0; i < 13; i++) {
			if(b1 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b2) {
						swap(b2,b1,c);
						dfs(a+1,b2,b1,c);
						swap(b2,b1,c);
					}
					else {
						swap(move[i][j],b1,c);
						dfs(a+1,move[i][j],b2,c);
						swap(move[i][j],b1,c);
					}
				}
			}
			else if(b2 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b1) {
						swap(b2,b1,c);
						dfs(a+1,b2,b1,c);
						swap(b2,b1,c);
					}
					else {
						swap(move[i][j],b2,c);
						dfs(a+1,b1,move[i][j],c);
						swap(move[i][j],b2,c);
					}
				}
			}
		}
	}
	

}

import java.util.Arrays;

import java.util.Scanner;

public class Main{
	static int[] parent;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] n = new int[b];
		int[] m = new int[b];
		parent = new int[a];
		for (int i = 0; i < m.length; i++) { //Setting up the two arrays start and finish
			n[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}
		
		for(int i = 0; i < parent.length; i ++) {
			parent[i]= i;
		}
		
		for (int i = 0; i < b; i++) {
		union(n[i], m[i]);
		}
		
		int q = scan.nextInt();
		for(int i = 0; i < q; i ++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			
			if(find(s) == find(t)) //runs for each one of the pairs inputed
				System.out.println("yes");
			else
				System.out.println("no");

		}
		
	}
	
	public static void union(int x,int y) {
		int r1 = find(x);
		int r2 = find(y);
		if(r1 != r2)
			parent[r2] = r1;
		
	}
	public static int find(int x) {
		int curr = x;
		if(parent[curr] == curr) return curr;
		parent[curr] = find(parent[curr]);
		return parent[curr];
	}


}


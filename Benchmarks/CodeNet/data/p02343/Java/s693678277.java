import java.util.Scanner;


public class Main{

	static int[] par;
	static int[] rank;

	static void initUF(int n) {
		par = new int[n];
		rank = new int[n];
		for (int i=0;i<n;i++){
			par[i] = i;
			rank[i] = 1;
		}
	}
	
	static int root(int n) {
		if (par[n]==n) {
			return n;
		} else {
			return (par[n] = root(par[n]));
		}
	}
	
	static boolean same(int i, int j) {
		return root(i)==root(j);
	}

	static void unite(int i, int j) {
		if (rank[i]>rank[j]) {
			par[j] = root(i);
			rank[i]++;
		} else {
			par[i] = root(j);
			rank[j]++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		
		initUF(n);
		for (int i=0;i<q;i++) {
			int com = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (com==0) {
				unite(x, y);
			} else {
				System.out.println(same(x, y) ? 1 : 0);
			}
		}
		
	}
	
}
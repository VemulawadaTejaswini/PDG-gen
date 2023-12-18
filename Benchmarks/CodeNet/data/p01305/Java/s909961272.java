import java.util.Scanner;
public class Main {
	
	static int[] a;
	static int[] b;
	static boolean[] k;
	static int z;
	
	static void dfs(int x, int pa, int pb) {
		if(x == 9) {
			z += pb<pa?1:0;
			return;
		}
		for(int i=0; i<9; i++) {
			if(k[i]) continue;
			k[i] = true;
			dfs(x + 1, pa + (b[x]<a[i]?a[i]+b[x]:0), pb + (b[x]<a[i]?0:a[i]+b[x]));
			k[i] = false;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			while(N-- != 0) {
				a = new int[9];
				b = new int[9];
				k = new boolean[9];
				
				for(int i=0; i<9; i++) a[i] = sc.nextInt();
				for(int i=0; i<9; i++) b[i] = sc.nextInt(); 
				
				z = 0;
				dfs(0, 0, 0);
				
				int bb = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
				double t = z * 1.0 / bb;
				
				System.out.printf("%.5f %.5f\n", t, 1-t);
			}
		}
	}
}

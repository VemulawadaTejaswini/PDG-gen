import java.util.Scanner;

public class Main {

	static int[] p;
	
	static int dfs(int nth, int a, int b) {
		if(nth < p.length) {
			return Math.min(dfs(nth+1, a+p[nth], b), dfs(nth+1, a, b+p[nth]));
		}
		else {
			return Math.abs(a-b);
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n == 0) break;
				p = new int[n];
				for(int i = 0; i < n; i++) {
					p[i] = sc.nextInt();
				}
				System.out.println(dfs(0, 0, 0));
			}
		}
	}
}

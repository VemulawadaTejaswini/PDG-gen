import java.util.Scanner;

public class Main {
	public static int[] square = new int[256];
	public static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 256; i++) {
			square[i] = i * i;
		}
		
		int n = sc.nextInt();
		while (n != 0) {
			count = 0;
			int p = 255;
			while (square[p] > n) {
				p--;
			}
			for (int i = p; i > 0; i--) {
				dfs(i, n - square[i], 0);
			}
			System.out.println(count);
			
			n = sc.nextInt();
		}
	}
	
	public static void dfs(int p, int rest, int times) {
		if (times == 4) return;
		if (rest == 0) {
			count++;
			return;
		}
		if (rest < 0) return;
		
		while (square[p] > rest) {
			p--;
		}
		for (int i = p; i > 0; i--) {
			dfs(i, rest - square[i], times + 1);
		}
	}
}
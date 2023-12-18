import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		int[] nc = new int[2000];
		for(int i = 1; i <= n; i++){
			for(int j = 2; j <= n; j++){
				if (i >= j) {
					continue;
				}
				int c1 = j - i;
				int c2 = Math.abs(i - x) + Math.abs(j - y) + 1;
				int c = Math.min(c1, c2);
				nc[c]++;
			}
		}

		for(int i = 1; i < n; i++) {
			System.out.println(nc[i]);
		}
	}
}

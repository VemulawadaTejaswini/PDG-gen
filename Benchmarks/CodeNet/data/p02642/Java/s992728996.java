import java.util.Scanner;

public class Main {
	
	static final int M = 1000000;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		int[] check = new int[M + 1];
		
		for (int i = 0; i < n; i++) {
			if (check[a[i]] != 0) {
				check[a[i]] = 2;
				break;
			}
			
			for (int j = a[i]; j <= M; j += a[i]) {
				check[j]++;
			}
			
		}
		
		int count = 0;
		
		for (int x: a) {
			if (check[x] == 1) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}

import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if(n == 0) {
				break;
			}
			int [] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i != j) {
						int k = Math.abs(a[i] - a[j]);
						min = Math.min(min, k);
					}
				}
			}
			System.out.println(min);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().exec();
	}

	void exec() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int food[] = new int[m];

		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int personalF = sc.nextInt();
				++food[personalF-1];
			}
		}
		int total = 0;
		for (int i = 0; i < m; i++) {
			if(food[i] == n) total++;
		}
		System.out.println(total);
		sc.close();
	}


}

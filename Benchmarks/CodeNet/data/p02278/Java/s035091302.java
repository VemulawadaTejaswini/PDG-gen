import java.util.Scanner;
import java.io.IOException;

// ALDS1_6_D
public class Main {
	int cost = 0;
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (A[min] > A[j]) min = j;
			}
			if (i == min) continue;
			cost += A[i] + A[min];
			int tmp = A[i];
			A[i] = A[min];
			A[min] = tmp;
		}
		System.out.println(cost);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}


import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] V = new int[n];
		int[] C = new int[n];

		for (int i = 0; i < n; i++) V[i] = sc.nextInt();
		for (int i = 0; i < n; i++) C[i] = sc.nextInt();
		int answer = 0;

		for (int i = 0; i < n; i++) {
			int v = V[i];
			int c = C[i];
			if (v-c > 0) 
				answer += (v-c);
		}

		System.out.println(answer);
	}
}
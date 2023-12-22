import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			if (c < v[i])
				sum += (v[i] - c);
		}
		System.out.println(sum);
	}

}

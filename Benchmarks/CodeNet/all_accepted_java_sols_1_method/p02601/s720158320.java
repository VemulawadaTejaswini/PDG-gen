import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int cnt = 0;
		while (B <= A) {
			B *= 2;
			cnt++;
		}

		while (C <= B) {
			C *= 2;
			cnt++;
		}

		if (cnt <= K) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

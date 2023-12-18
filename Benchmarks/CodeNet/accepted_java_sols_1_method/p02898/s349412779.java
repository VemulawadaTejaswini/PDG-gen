import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int number = 0;
		int resultCount = 0;
		for (int i = 0; i < N; i++) {
			number = sc.nextInt();
			if (number >= K) {
				resultCount++;
			}
		}
		System.out.println(resultCount);
	}
}
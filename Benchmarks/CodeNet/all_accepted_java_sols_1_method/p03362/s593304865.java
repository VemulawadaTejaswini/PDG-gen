import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 55555;
		boolean isPrime = false;
		List<Integer> list = new ArrayList<>();
		for (int i = 7; i < num; i++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if (isPrime && i % 5 == 1) {
				list.add(i);
			}
		}
		String ans = "";
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				ans += list.get(i);
			} else {
				ans += list.get(i) + " ";
			}
		}
		System.out.println(ans);
	}
}
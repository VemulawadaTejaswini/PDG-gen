import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		HashSet<Integer> list = new HashSet<Integer>();

		for (int i = 1; i <= K; i++) {
			int A = sc.nextInt();
			for (int j = 1; j <= A; j++) {
				list.add(sc.nextInt());
			}
		}

		System.out.println(N - list.size());

	}

}
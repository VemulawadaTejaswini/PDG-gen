import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		Set<Integer> k = new HashSet<>();

		for(int i = 0; i < K; i++) {
			int d = scan.nextInt();
			for(int j = 0; j < d; j++) {
				k.add(scan.nextInt());
			}
		}


		System.out.println(N - k.size());

	}
}
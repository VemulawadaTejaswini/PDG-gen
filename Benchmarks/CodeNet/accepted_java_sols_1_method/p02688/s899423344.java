import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		 List<Integer> list = new ArrayList<>();
		for(int i =0; i < K; i++) {
			int d = sc.nextInt();
			for(int num = 0; num < d; num++ ) {
				int kos = sc.nextInt();
				if(!list.contains(kos)) {
					 list.add(kos);
				}

			}
		}
			System.out.println(N-list.size());
		}
}

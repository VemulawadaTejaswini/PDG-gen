import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			if(N == 1) {
				System.out.println(K);
				System.exit(0);
			}
			for (int j = 0; j < K; j++) {
				int A = sc.nextInt();
				//初回
				if (i == 0) {
					list1.add(A);
					continue;
				} else if (list1.contains(A)) {
					list2.add(A);

				}
			}

			if (i != 0 || i == N-1) {
				list1.clear();
				list1.addAll(list2);
				list2.clear();

			}

		}
		System.out.println(list1.size());
	}
}

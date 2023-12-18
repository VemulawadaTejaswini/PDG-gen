import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> hn = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				hn.add(sc.nextInt());
			}
			// 出力(整数)
			int result = 0;
			for (int i : hn) {
				if (k <= i) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}

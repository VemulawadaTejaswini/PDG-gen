import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			aList.add(sc.nextInt());
		}
		int ans = (N + K - 3) / (K - 1);
		System.out.println(ans);
	}
}
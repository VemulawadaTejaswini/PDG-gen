import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		boolean judge = true;
		int voteSum = 0;
		Integer[] arrayA = new Integer[N];

		for (int i = 0; i < N; i++) {
			arrayA[i] = Integer.parseInt(sc.next());
			voteSum += arrayA[i];
		}
		sc.close();
		//降順にソートする
		Arrays.sort(arrayA, Comparator.reverseOrder());

		for (int i = 0; i < M; i++) {
			//総投票数の1/4M未満であるか
			if (4 * M * arrayA[i] < voteSum ) {
				judge = false;
				break;
			}
		}
		System.out.println(judge ? "Yes" : "No");
	}
}
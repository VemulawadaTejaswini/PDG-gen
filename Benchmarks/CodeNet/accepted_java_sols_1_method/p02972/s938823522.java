import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		ArrayList<Integer> exsist = new ArrayList<Integer>();
		boolean exis[] = new boolean[N];
		for (int i = 0; i < N; i++) {
			A[i] = scn.nextInt();
		}
		for (int i = N; i > 0; i--) {
			int sum = 0;
			for (int j = i * 2; j <= N; j += i) {
				if (exis[j - 1])
					sum++;
			}
			if (sum % 2 != A[i - 1]) {
				exsist.add(i);
				exis[i - 1] = true;
			}
		}
		System.out.println(exsist.size());
		for (int i = exsist.size(); i > 0; i--) {
			System.out.print(exsist.get(i - 1) + ((i == 1) ? "" : " "));
		}
	}

}
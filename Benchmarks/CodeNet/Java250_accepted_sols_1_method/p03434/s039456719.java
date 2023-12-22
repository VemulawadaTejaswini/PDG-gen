import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		int aliceSum = 0, bobSum = 0;

		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}

		Collections.sort(A);
		Collections.reverse(A);

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				aliceSum += A.get(i);
			} else {
				bobSum += A.get(i);
			}
		}

		System.out.println(aliceSum - bobSum);
	}
}

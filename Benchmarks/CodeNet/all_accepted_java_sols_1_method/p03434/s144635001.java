import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> iList = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			iList.add(sc.nextInt());
		}

		int aliceSum = 0;
		int bobSum = 0;

		Collections.sort(iList, Collections.reverseOrder());

		for (int i=0; i<N; i++) {
			int num = iList.get(i);

			if (i%2 == 0) {
				// TURN:alice
				aliceSum += num;
			}
			else {
				// TURN:Bob
				bobSum += num;
			}

		}

		System.out.println(aliceSum - bobSum);

	}

}

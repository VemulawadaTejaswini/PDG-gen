import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Integer num[] = new Integer[105];
		for (int i = 0; i < N; i++) {
			num[i] =sc.nextInt();
		}
		int alice = 0;
		int bob = 0;

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			li.add(num[i]);
		}

		Collections.sort(li);

		for (int i = N - 1; i >= 0; i--) {
			alice += li.get(i);
			if (--i < 0) {
				break;
			}
			bob += li.get(i);
		}

		System.out.println(alice - bob);
	}
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a, Collections.reverseOrder());

		int aliceScore = 0;
		int bobScore = 0;
		for(int i = 0; i < N; i++) {
			if(i%2 == 0) {
				aliceScore += a.get(i);
			} else {
				bobScore += a.get(i);
			}
		}

		System.out.println(aliceScore-bobScore);
	}
}
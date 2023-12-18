import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> mochi = new ArrayList<>();

        for (int i = 0; i < N; i++) {
        	mochi.add(scanner.nextInt());
        }
        Collections.sort(mochi);

		int count = 1;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
			    continue;
			}
			if (mochi.get(i) != mochi.get(i-1)) {
			    count++;
			}
		}
		System.out.println(count);

	}

}
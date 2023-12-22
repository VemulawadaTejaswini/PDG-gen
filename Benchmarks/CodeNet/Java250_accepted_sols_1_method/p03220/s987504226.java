import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		ArrayList<Integer> high = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			high.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ans = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int tmp = T * 1000 - high.get(i) * 6;
			if(Math.min(min, Math.abs(1000 * A - tmp)) == Math.abs(1000 * A - tmp)) {
				min = Math.min(min, Math.abs(1000 * A - tmp));
				ans = i + 1;
			}else {
				continue;
			}
		}
		System.out.println(ans);
	}

}
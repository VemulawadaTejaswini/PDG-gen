import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}

		int ans = Integer.MAX_VALUE;
		Collections.sort(list);
		for(int i = 1; i <= 100; i++) {
			int sum = 0;
			for(int j = 0; j < list.size(); j++) {
				int tmp = Math.abs(list.get(j) - i);
				sum += tmp * tmp;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
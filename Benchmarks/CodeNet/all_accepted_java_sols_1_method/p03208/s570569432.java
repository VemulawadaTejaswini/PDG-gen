import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		Collections.sort(list);
		int distance = list.get(N - 1) -list.get(0);

		for(int i = 0; i <= N - K; i++) {
			int left = i;
			int right = i + K -1;
			int tmp = list.get(right) - list.get(left);
			if(tmp < distance) {
				distance = tmp;
			}
		}
		System.out.println(distance);

	}
}
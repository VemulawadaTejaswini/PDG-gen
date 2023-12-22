import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();


		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		int sum = 0;

		for (int i = 0; i < N; i++) {
			if (i == N-1) {
				sum += list.get(i)/2;
				break;
			}
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}

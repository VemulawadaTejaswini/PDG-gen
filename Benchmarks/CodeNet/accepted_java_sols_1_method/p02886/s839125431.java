import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		int sum = 0;

		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				sum += list.get(i) * list.get(j);
			}
		}

		System.out.println(sum);

		sc.close();
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		sc.close();

		long sum = 0;
		int size = list.size();
		for (int i = 0; i < size - 1; i++) {
			long li = list.get(i);
			for (int j = i + 1; j < size; j++) {
				long lj = list.get(j);
				sum = sum + li * lj;
			}
		}
		System.out.println(sum);
	}
}

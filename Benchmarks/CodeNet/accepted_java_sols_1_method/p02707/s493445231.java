import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(0);
		}
		for (int i = 1; i < n; i++) {
			int in = sc.nextInt() - 1;
			int num = list.get(in);
			list.set(in, num + 1);
		}
		list.forEach(System.out::println);
	}
}

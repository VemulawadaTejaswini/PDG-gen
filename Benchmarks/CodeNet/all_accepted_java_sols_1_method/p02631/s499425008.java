import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int xor = sc.nextInt();
		list.add(xor);
		for (int i = 1; i < n; i++) {
			int in = sc.nextInt();
			xor = in ^ xor;
			list.add(in);
		}
		List<Integer> values = new ArrayList<>();
		for (Integer i : list) {
			values.add(xor ^ i);
		}
		System.out.println(values.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}
}

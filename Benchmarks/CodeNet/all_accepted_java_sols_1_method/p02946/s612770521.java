import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		List<String> list = new ArrayList<>();
		for (int i = x - k + 1; i < x + k; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println(String.join(" ", list));
	}
}

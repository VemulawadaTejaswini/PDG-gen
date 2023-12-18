
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		List<String> list = new ArrayList<>();
		String W = scan.next();
		list.add(W);
		String preW;
		for (int i = 1; i < N; i++) {
			W = scan.next();
			if (list.contains(W)) {
				System.out.println("No");
				return;
			}
			preW = list.get(i - 1);
			if (preW.charAt(preW.length() - 1) != W.charAt(0)) {
				System.out.println("No");
				return;
			}
			list.add(W);
		}
		System.out.println("Yes");

	}
}

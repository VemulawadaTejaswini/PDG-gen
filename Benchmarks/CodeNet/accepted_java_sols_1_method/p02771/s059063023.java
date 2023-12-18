import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String re = "No";

		Set<Integer> se = new HashSet<>();
		se.add(a);
		se.add(b);
		se.add(c);

		if (se.size() == 2) {
			re = "Yes";
		}

		System.out.println(re);
	}

}
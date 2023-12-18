import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		System.out.println(s);
		System.out.println(t);
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < s.length() - t.length() + 1; i++) {

			int count = 0;
			for (int j = 0; j < t.length(); j++) {
				System.out.println("---------");
				System.out.println("t:" + t.charAt(j));
				System.out.println("s:" + s.charAt(i + j));
				if (t.charAt(j) != s.charAt(i + j)) {
					count++;
				}

			}
			list.add(count);

		}

		System.out.println(list);
		int minReplace = list.stream().mapToInt(x -> x).min().getAsInt();

		System.out.println(minReplace);

	}
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		List<Set<String>> dict = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			dict.add(new HashSet<>());
		}

		for (int i = 0; i < n; i++) {
			String in = sc.nextLine();
			doMethod(in, dict);
		}
	}

	private static void doMethod(String in, List<Set<String>> dict) {

		String[] param = in.split(" ");
		int n = dict.size();
		int key = param[1].hashCode() % n;
		if (key<0) key = -key;

		if(param[0].equals("insert")) {
			dict.get(key).add(param[1]);

		} else {
			Set<String> kouhos = dict.get(key);
			for(String kouho : kouhos) {
				if(kouho.equals(param[1])) {
					System.out.println("yes");
					return;
				}
			}
			System.out.println("no");
		}
	}
}
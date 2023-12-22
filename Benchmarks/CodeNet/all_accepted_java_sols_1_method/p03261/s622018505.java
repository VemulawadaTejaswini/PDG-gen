
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		String[] w = new String[n];
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			w[i] = sc.next();
			set.add(w[i]);
		}
		
		for (int i = 1; i < n; i++) {
			if (w[i].charAt(0) != w[i - 1].charAt(w[i - 1].length() - 1)) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println((set.size() == n) ? "Yes" : "No");

	}

}

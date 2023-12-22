import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			set.add(scan.next());
		}
		System.out.println(set.size());
	}

}

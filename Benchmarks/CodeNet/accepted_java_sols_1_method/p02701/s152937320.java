import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> linkhash = new LinkedHashSet<String>();
		for (int i = 0; i < n; i++) {
			linkhash.add(sc.next());
		}
		System.out.println(linkhash.size());
	}
}

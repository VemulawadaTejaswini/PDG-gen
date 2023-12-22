import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.nextLine());

		Set<String> items =new HashSet<String>();

		for (int i = 0; i < A; i++) {
			items.add(sc.nextLine());
		}

		System.out.println(items.size());

	}
}
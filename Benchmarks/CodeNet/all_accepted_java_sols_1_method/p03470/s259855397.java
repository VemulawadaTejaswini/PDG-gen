import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Integer> d = new HashSet<>();
		for (int i = 0; i < n; i++) {
			d.add(in.nextInt());
		}
		System.out.println(d.size());

		in.close();
	}
}
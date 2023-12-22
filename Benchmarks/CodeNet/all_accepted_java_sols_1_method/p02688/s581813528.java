import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		HashSet<Integer> owners = new HashSet<Integer>();
		for (int i = 0; i < k; ++i) {
			for (int j = 0, d = sc.nextInt(); j < d; ++j) {
				owners.add(sc.nextInt());
			}
		}
		System.out.println(n - owners.size());
	}
}

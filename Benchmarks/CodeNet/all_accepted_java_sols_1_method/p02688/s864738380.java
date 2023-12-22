import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int l = 0; l < d; l++) {
				set.add(sc.nextInt());
			}
		}
		int kotae = n - set.size();
		System.out.println(kotae);

		sc.close();
	}
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxN = sc.nextInt();
		int maxM = sc.nextInt();
		int want = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int n = 0; n <= maxM; n++) {
			for(int m = 0; m <= maxN; m++) {
				set.add(maxN * n + maxM * m - 2 * n * m);
			}
		}
		System.out.println(set.contains(want) ? "Yes" : "No");
	}
}
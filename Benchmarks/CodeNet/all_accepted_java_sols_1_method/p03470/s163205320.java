
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			set.add(scan.nextInt());
		}
		
		System.out.println(set.size());
	}
}

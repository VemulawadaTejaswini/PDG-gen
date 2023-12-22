import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Set<Integer> a = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			if (!a.contains(x)) {
				a.add(x);				
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");

	}

}
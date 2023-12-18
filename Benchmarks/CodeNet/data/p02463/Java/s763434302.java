import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			Set<Integer> a = new TreeSet<>();
			for(int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				a.add(sc.nextInt());
			}

			a.forEach(num -> System.out.println(num));
		}
	}
}

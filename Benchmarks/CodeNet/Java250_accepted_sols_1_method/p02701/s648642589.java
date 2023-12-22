
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		Set<String> a = new HashSet();

		for(int i = 0; i < N;i++) {
			a.add(sc.next());
		}
		System.out.println(a.size());


	}
}
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = Integer.parseInt(sc.next());
		HashSet<String> reg = new HashSet<String>();
		for (int i = 0; i < N; ++i) {
			reg.add(sc.next());
		}
		int M = sc.nextInt();
		boolean open = false;
		for (int i = 0; i < M; ++i) {
			String id = sc.next();
			if (reg.contains(id)) {
				System.out.println((open ? "Closed" : "Opened") + " by " + id);
				open = !open;
			} else {
				System.out.println("Unknown " + id);
			}
		}
	}

}
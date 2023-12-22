import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static PrintStream o = System.out;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> get = new HashSet<String>(n);
		int res = 0;
		sc.nextLine();
		String one;
		for (int i = 0; i < n; i++) {
			one = sc.nextLine();
			if (!get.contains(one)) {
				get.add(one);
				res++;
			}
		}
		o.println(res);
	}
}
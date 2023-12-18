import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			if(a.equals("insert")) {
				s.add(sc.next());
			}else if(a.equals("find")) {
				boolean b = s.contains(sc.next());
				if(b == true) System.out.println("yes");
				else System.out.println("no");
			}
		}
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			if (n == 0) break;
			int ans = -100000;
			int acc = 0;
			for (int i=0;i<n;i++) {
				acc += s.nextInt();
				ans = Math.max(ans, acc);
				if (acc < 0) acc = 0;
			}
			System.out.println(ans);
		}
	}
}


import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if (n==0) break;
			List<Character> be = new ArrayList<Character>(n);
			List<Character> af = new ArrayList<Character>(n);
			for (int i=0; i<n; i++) {
				be.add(sc.next().charAt(0));
				af.add(sc.next().charAt(0));
			}
			int m = sc.nextInt();
			for (int i=0; i<m; i++) {
				char now = sc.next().charAt(0);
				int in = be.indexOf(now);
				if (in<0) {
					System.out.print(now);
				} else {
					System.out.print(af.get(in));
				}
			}
			System.out.println();
		}
	}
}
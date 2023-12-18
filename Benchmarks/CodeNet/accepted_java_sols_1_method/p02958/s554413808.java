import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if (i + 1 != p[i]) {
				count++;
			}
		}
		if (count == 0 || count == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
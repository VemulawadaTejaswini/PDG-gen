import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = Integer.parseInt(sc.next());
			int f = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			if (m == -1 && f == -1 && r == -1) break;
			int sum = m + f ;
			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (80 <= sum) {
				System.out.println("A");
			} else if (65 <= sum) {
				System.out.println("B");
			} else if (50 <= sum) {
				System.out.println("C");
			} else if (30 <= sum) {
				if (50 <= r) System.out.println("C");
				else System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
		sc.close();
	}
}
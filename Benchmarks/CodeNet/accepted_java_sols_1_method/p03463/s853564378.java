import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int[] m = new int[n];
		int count = 0;
		if (a < b)
			while(true) {
				if (b - a > 1)
					a++;
				else if (a != 1)
					a--;
				else {
					System.out.println("Borys");
					return;
				}
				if (b - a > 1)
					b--;
				else if (b != n)
					b++;
				else {
					System.out.println("Alice");
					return;
				}
				count++;
				if (count > 200) {
					System.out.println("Draw");
					return;
				}
			}
		else
			while(true) {
				if (a - b > 1)
					a--;
				else if (a != n)
					a++;
				else {
					System.out.println("Borys");
					return;
				}
				if (a - b > 1)
					b++;
				else if (b != 1)
					b--;
				else {
					System.out.println("Alice");
					return;
				}
				count++;
				if (count > 200) {
					System.out.println("Draw");
					return;
				}
			}
	}
}
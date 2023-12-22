import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		sc.close();

		int max = 0;

		if (k <= a) {
			max = k;
		} else if (k <= a + b) {
			max = a;
		} else {
			max = a - (k-a-b);
		}

		System.out.println(max);
	}

}

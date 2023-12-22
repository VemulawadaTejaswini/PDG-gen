import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());

		int minAbs = 100;
		int sum = 0;

		for (int i = l; i < l + n; i++) {
			sum += i;
			if (Math.abs(i) < Math.abs(minAbs)) {
				minAbs = i;
			}
		}
		System.out.println(sum - minAbs);
	}
}
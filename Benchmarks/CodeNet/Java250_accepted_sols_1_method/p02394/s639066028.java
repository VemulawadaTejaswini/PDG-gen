import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] b = x.split(" ");
		int[] e = new int[b.length];
		for (int i = 0; i < e.length; i++) {
			e[i] = Integer.parseInt(b[i]);

		}
		if (e[0] >= e[2] + e[4] && e[1] >= e[3] + e[4]&&e[2]-e[4]>=0&&e[3]-e[4]>=0) {
			System.out.println("Yes");

		} else {
			System.out.println("No");

		}

	}
}
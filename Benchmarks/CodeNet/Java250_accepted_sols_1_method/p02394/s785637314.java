import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[k.length];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(k[i]);
		}
		if (v[2] - v[4] < 0 || v[2] + v[4] > v[0] || v[3] - v[4] < 0
				|| v[3] + v[4] > v[1]) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
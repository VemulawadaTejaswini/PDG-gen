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

		if (v[0] < v[1] && v[1] < v[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
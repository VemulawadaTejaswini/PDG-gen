import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] x = line.split(" ");
		int[] n = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			n[i] = Integer.parseInt(x[i]);
		}

		for (int i = 0; i < n.length; i++) {
			int keep = n[i];
			int j = i - 1;
			while (j >= 0 && n[j] > keep) {
				n[j + 1] = n[j];
				j--;
			}
			n[j + 1] = keep;

		}

		System.out.println(n[0] + " " + n[1] + " " + n[2]);

	}

}
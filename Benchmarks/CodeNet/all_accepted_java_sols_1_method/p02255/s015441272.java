import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int[] vs = new int[v];
		String line2 = sc.nextLine();
		String[] lc = line2.split(" ");
		for (int i = 0; i < vs.length; i++) {
			vs[i] = Integer.parseInt(lc[i]);
		}
		System.out.println(line2);

		for (int i = 1; i < vs.length; i++) {
			int key = vs[i];
			int j = i - 1;
			while (j >= 0 && vs[j] > key) {
				vs[j + 1] = vs[j];
				j--;
			}
			vs[j + 1] = key;
			for (int j2 = 0; j2 < vs.length - 1; j2++) {
				System.out.print(vs[j2] + " ");
				if (j2 == vs.length - 2) {
					System.out.println(vs[j2 + 1]);
				}
			}

		}

	}
}
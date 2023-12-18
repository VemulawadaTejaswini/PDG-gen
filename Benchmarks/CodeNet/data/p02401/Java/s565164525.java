import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		String[] e = new String[10000];
		int[] e1 = new int[10000];
		int[] e2 = new int[10000];

		for (int j = 0; j < e2.length; j++) {

			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			String[] k = line.split(" ");
			e[j] = k[1];
			if (k[1].equals("?")) {
				break;
			}
			
			e1[j] = Integer.parseInt(k[0]);
			e2[j] = Integer.parseInt(k[2]);
		}

		for (int j = 0; j < e2.length; j++) {
			if (e[j].equals("?")) {
				break;
			}
			if (e[j].equals("+")) {
				System.out.println(e1[j] + e2[j]);
			}
			if (e[j].equals("-")) {
				System.out.println(e1[j] - e2[j]);
			}
			if (e[j].equals("*")) {
				System.out.println(e1[j] * e2[j]);
			}
			if (e[j].equals("/")) {
				System.out.println(e1[j] / e2[j]);
			}
		}

	}
}
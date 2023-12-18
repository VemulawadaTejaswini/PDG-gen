import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int[] vs = new int[v];
		for (int i = 0; i < v; i++) {
			String line2 = sc.nextLine();
			vs[i] = Integer.parseInt(line2);
		}
		int sum = 0;
		for (int i = 0; i < v; i++) {
			for (int j = i + 1; j < v; j++) {
				if (i == 0 && j == 1) {
					sum = vs[j] - vs[i];
				} else if (sum < vs[j] - vs[i]) {
					sum = vs[j] - vs[i];
				}
				
			}
		}System.out.println(sum);

	}
}
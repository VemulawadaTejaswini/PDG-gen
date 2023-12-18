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

		int min = vs[0];
		int max = vs[1]-vs[0];
		for (int i = 1; i < v; i++) {
			if (max<vs[i]-min) {
				max=vs[i]-min;
			}
			if (min>vs[i]) {
				min=vs[i];
			}
			}
		System.out.println(max);

	}
}
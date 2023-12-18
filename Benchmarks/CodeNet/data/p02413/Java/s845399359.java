import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[2];
		v[0] = Integer.parseInt(k[0]);
		v[1] = Integer.parseInt(k[1]);
		int[] tatesum = new int[v[1] + 1];
		for (int i = 0; i < v[0]; i++) {
			String linek = sc.nextLine();
			String[] suuzi = linek.split(" ");
			int[] kazu = new int[v[1]];
			for (int j = 0; j < kazu.length; j++) {
				kazu[j] = Integer.parseInt(suuzi[j]);
			}
			int sum = 0;
			for (int j = 0; j < kazu.length; j++) {
				sum += kazu[j];
			}
			for (int j = 0; j < kazu.length; j++) {
				tatesum[j] += kazu[j];
			}
			System.out.println(linek + " " + sum);
			tatesum[v[1] ] += sum;
		}
		for (int i = 0; i < tatesum.length - 1; i++) {
			System.out.print(tatesum[i] + " ");
		}
		System.out.println(tatesum[v[1] ]);

	}
}
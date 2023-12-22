import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] kari = line.split(" ");
		int r = Integer.parseInt(kari[0]);
		int c = Integer.parseInt(kari[1]);

		int bigsum = 0;

		int[] sum2 = new int[c];

		for (int i = 0; i < r; i++) {
			String s = sc.nextLine();
			String[] k = s.split(" ");
			int[] in = new int[c];
			int[] za = new int[2];
			int sum1 = 0;
			for (int j = 0; j < c; j++) {
				in[j] = Integer.parseInt(k[j]);
				System.out.print(in[j]);
				System.out.print(" ");

				sum1 += in[j];
				sum2[j] += in[j];
			}
			System.out.println(sum1);
			bigsum += sum1;
		}

		for (int i = 0; i < c; i++) {
			System.out.print(sum2[i]);
			System.out.print(" ");
		}

		System.out.println(bigsum);

	}

}
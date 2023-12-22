import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int[] kou = new int[120];
		for (int i = 0; i < 120; i++) {
			kou[i] = 0;
		}

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str);

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] kari1 = line.split(" ");
			int[] kari2 = new int[4];
			for (int j = 0; j < 4; j++) {
				kari2[j] = Integer.parseInt(kari1[j]);
			}

			int number = (kari2[0] - 1) * 30 + (kari2[1] - 1) * 10
					+ (kari2[2] - 1);
			kou[number] += kari2[3];
		}

		for (int i = 0; i < 120; i++) {
			if (i == 119) {
				System.out.print(" ");
				System.out.println(kou[i]);
			} else if ((i + 1) % 30 == 0) {
				System.out.print(" ");
				System.out.println(kou[i]);
				System.out.println("####################");
			} else if ((i + 1) % 10 == 0) {
				System.out.print(" ");
				System.out.println(kou[i]);
			} else {
				System.out.print(" ");
				System.out.print(kou[i]);
			}
		}

	}
}
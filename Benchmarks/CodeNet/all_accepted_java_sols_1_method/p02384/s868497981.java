import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] deme = line.split(" ");

		int[] daice = new int[] { Integer.parseInt(deme[0]),
				Integer.parseInt(deme[1]), Integer.parseInt(deme[2]),
				Integer.parseInt(deme[3]), Integer.parseInt(deme[4]),
				Integer.parseInt(deme[5]) };
		String line2 = sc.nextLine();
		int kazu = Integer.parseInt(line2);
		String[] mondai = new String[kazu];

		for (int i = 0; i < kazu; i++) {
			mondai[i] = sc.nextLine();
		}

		for (String string : mondai) {
			String[] mondai2 = string.split(" ");

			int ue = Integer.parseInt(mondai2[0]);
			int mae = Integer.parseInt(mondai2[1]);
			if (ue == daice[0]) {

				if (mae == daice[1]) {
					System.out.println(daice[2]);
				} else if (mae == daice[2]) {
					System.out.println(daice[4]);
				} else if (mae == daice[3]) {
					System.out.println(daice[1]);
				} else if (mae == daice[4]) {
					System.out.println(daice[3]);
				}
			} else if (ue == daice[1]) {

				if (mae == daice[0]) {
					System.out.println(daice[3]);
				} else if (mae == daice[2]) {
					System.out.println(daice[0]);
				} else if (mae == daice[3]) {
					System.out.println(daice[5]);
				} else if (mae == daice[5]) {
					System.out.println(daice[2]);
				}
			} else if (ue == daice[2]) {

				if (mae == daice[0]) {
					System.out.println(daice[1]);
				} else if (mae == daice[1]) {
					System.out.println(daice[5]);
				} else if (mae == daice[4]) {
					System.out.println(daice[0]);
				} else if (mae == daice[5]) {
					System.out.println(daice[4]);
				}
			} else if (ue == daice[3]) {

				if (mae == daice[0]) {
					System.out.println(daice[4]);
				} else if (mae == daice[1]) {
					System.out.println(daice[0]);
				} else if (mae == daice[4]) {
					System.out.println(daice[5]);
				} else if (mae == daice[5]) {
					System.out.println(daice[1]);
				}
			}else if (ue == daice[4]) {

				if (mae == daice[0]) {
					System.out.println(daice[2]);
				} else if (mae == daice[2]) {
					System.out.println(daice[5]);
				} else if (mae == daice[3]) {
					System.out.println(daice[0]);
				} else if (mae == daice[5]) {
					System.out.println(daice[3]);
				}
			}else if (ue == daice[5]) {

				if (mae == daice[1]) {
					System.out.println(daice[3]);
				} else if (mae == daice[2]) {
					System.out.println(daice[1]);
				} else if (mae == daice[3]) {
					System.out.println(daice[4]);
				} else if (mae == daice[4]) {
					System.out.println(daice[2]);
				}
			}
		}
	}
}
import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] deme = line.split(" ");

		int[] demes = new int[] { Integer.parseInt(deme[0]),
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

			if (ue + mae <= 5) {
				System.out.println(demes[ue + mae]);
			} else if (ue < mae) {
				System.out.println(demes[mae - ue+1]);
			} else if (ue > mae) {
				System.out.println(demes[ue - mae+1]);
			}

		}
	}
}
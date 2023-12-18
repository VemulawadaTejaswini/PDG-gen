import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n > 0) {
				int[] ageCounter = new int[7];
				for (; n > 0; n--) {
					String age = in.next().trim();
					if (age.length() == 1) {
						ageCounter[0]++;
					} else if (age.startsWith("1")) {
						ageCounter[1]++;
					} else if (age.startsWith("2")) {
						ageCounter[2]++;
					} else if (age.startsWith("3")) {
						ageCounter[3]++;
					} else if (age.startsWith("4")) {
						ageCounter[4]++;
					} else if (age.startsWith("5")) {
						ageCounter[5]++;
					} else {
						ageCounter[6]++;
					}
				}
				for (int count : ageCounter) {
					System.out.println(count);
				}
			} else {
				break;
			}
		}
	}
}
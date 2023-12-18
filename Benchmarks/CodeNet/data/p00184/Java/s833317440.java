import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n > 0) {
				int[] ageCounter = new int[7];
				for (; n > 0; n--) {
					
					int age = in.nextInt();
					if (age < 10) {
						ageCounter[0]++;
					} else if (age < 20) {
						ageCounter[1]++;
					} else if (age < 30) {
						ageCounter[2]++;
					} else if (age < 40) {
						ageCounter[3]++;
					} else if (age < 50) {
						ageCounter[4]++;
					} else if (age < 60) {
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
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int max = 0;
		int maxTmp = 0;
		int before = 0;
		while (sc.hasNextInt()) {
			int input = sc.nextInt();
			if (before >= input) {
				maxTmp++;
			} else {
				maxTmp = 0;
			}
			if (max < maxTmp) {
				max = maxTmp;
			}
			before = input;
		}
		System.out.println(max);
	}
}

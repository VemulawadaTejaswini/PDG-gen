import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				String str = sc.nextLine();
				find_JOI_IOI(str);
			}
		sc.close();
	}

	private static void find_JOI_IOI(String str) {
		int joi = 0;
		int ioi = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'J' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
					joi++;
			} else if (str.charAt(i) == 'I' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
					ioi++;
			}
		}

		System.out.printf("%d\n%d\n", joi, ioi);
	}

}
